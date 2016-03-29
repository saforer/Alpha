package com.alpha.game.Controllers;

import com.alpha.game.BoardObjects.BoardObject;

/**
 * Created by Forer on 3/28/2016.
 */
public class Controller {
    public BoardObject parent;
    public Controller(BoardObject parent) {
        this.parent = parent;
    }

    public void update(float dt) {

    }
}
