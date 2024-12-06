#include "models.cpp"
#include<iostream>
#include<climits>
#include<vector>
#include<queue>

using namespace std;

class DiceService {
public:
    int roll() {
        return rand() % 6 + 1; // Random number between 1 and 6
    }
};

class PlayerService {
public:
    void movePlayer(Player& player, int steps, int boardSize) {
        int newPosition = player.position + steps;
        if (newPosition > boardSize) {
            // Player does not move if the roll overshoots the board size
            return;
        }
        player.position = newPosition;
    }
};

class BoardService {
public:
    int applySnakesAndLadders(int position, vector<Snake>& snakes, vector<Ladder>& ladders) {
        for (auto& snake : snakes) {
            if (position == snake.start) {
                return snake.end;
            }
        }

        for (auto& ladder : ladders) {
            if (position == ladder.start) {
                return ladder.end;
            }
        }

        return position;
    }
};

class GameService {
private:
    Board board;
    DiceService diceService;
    PlayerService playerService;
    BoardService boardService;
    queue<Player> players;

public:
    GameService(Board board, vector<Player> playerList)
        : board(board) {
        for (auto& player : playerList) {
            players.push(player);
        }
    }

    void playGame() {
        while (true) {
            Player currentPlayer = players.front();
            players.pop();

            // Roll dice
            int diceRoll = diceService.roll();
            cout << currentPlayer.id << " rolled a " << diceRoll << endl;

            // Move player
            playerService.movePlayer(currentPlayer, diceRoll, board.size);

            // Apply snakes or ladders
            int newPosition = boardService.applySnakesAndLadders(
                currentPlayer.position, board.snakes, board.ladders);

            currentPlayer.position = newPosition;

            cout << currentPlayer.id << " moved to position " << newPosition << endl;

            // Check for win
            if (newPosition == board.size) {
                cout << currentPlayer.id << " wins the game!" << endl;
                break;
            }

            // Add player back to the queue
            players.push(currentPlayer);
        }
    }
};
