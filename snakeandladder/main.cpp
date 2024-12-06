#include "models.cpp"
#include "services.cpp"

int main() {
    // Create snakes
    vector<Snake> snakes = {Snake(16, 6), Snake(47, 26), Snake(49, 11)};

    // Create ladders
    vector<Ladder> ladders = {Ladder(2, 15), Ladder(8, 31), Ladder(28, 84)};

    // Create board
    Board board(100, snakes, ladders);

    // Create players
    vector<Player> players = {Player("Alice"), Player("Bob")};

    // Create game service
    GameService gameService(board, players);

    // Start the game
    gameService.playGame();

    return 0;
}
