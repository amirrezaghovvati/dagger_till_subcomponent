package com.example.disubcomponent.Mobile;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {
    private Board board;
    private Screen screen;
    @Inject
    public Mobile(Board board, Screen screen) {
        this.board = board;
        this.screen = screen;
    }
    public void runMobile(){
        board.runBoardStorage();
        Log.i("TAG", "Mobile is running!");
    }
}
