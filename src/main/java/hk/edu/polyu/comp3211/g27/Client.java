package hk.edu.polyu.comp3211.g27;

import hk.edu.polyu.comp3211.g27.controller.InGameController;
import hk.edu.polyu.comp3211.g27.controller.PostGameController;
import hk.edu.polyu.comp3211.g27.controller.PreGameController;

public class Client {
    private GameState state;
    private PreGameController pre;
    private InGameController in;
    private PostGameController post;

    public static void main(String[] args) {

    }

    private void run() {
        state = GameState.PRE_GAME;

        while (true) {
            if (state == GameState.PRE_GAME) preGame();
            else if (state == GameState.IN_GAME) inGame();
            else postGame();
        }
    }

    private void preGame() {
        state = GameState.IN_GAME;
    }

    private void inGame() {
        if (in.isGameEnd()) state = GameState.POST_GAME;
    }

    private void postGame() {

    }
}

enum GameState {
    PRE_GAME,
    IN_GAME,
    POST_GAME
}