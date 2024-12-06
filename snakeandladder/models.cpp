#include<vector>
#include<iostream>
#include<string>

using namespace std;

class Player {
public:
    string id;
    int position;

    Player(string id) : id(id), position(0) {}
};

class Snake {
public:
    int start;
    int end;

    Snake(int start, int end) : start(start), end(end) {}
};

class Ladder {
public:
    int start;
    int end;

    Ladder(int start, int end) : start(start), end(end) {}
};

class Board {
public:
    int size;
    vector<Snake> snakes;
    vector<Ladder> ladders;

    Board(int size, vector<Snake> snakes, vector<Ladder> ladders)
        : size(size), snakes(snakes), ladders(ladders) {}
};
