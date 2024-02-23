package com.example.disubcomponent.Mobile;

import javax.inject.Inject;

public class Board {
    private Camera camera;
    private Storage storage;
    @Inject
    public Board(Camera camera,Storage storage){
        this.camera=camera;
        this.storage=storage;
    }
    public void runBoardStorage(){
        storage.runStorage();
    }
}
