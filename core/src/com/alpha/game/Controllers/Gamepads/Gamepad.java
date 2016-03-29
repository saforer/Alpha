package com.alpha.game.Controllers.Gamepads;

import com.alpha.game.BoardObjects.BoardObject;
import com.alpha.game.BoardObjects.Direction;
import com.alpha.game.Controllers.Controller;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

/**
 * Created by Forer on 3/28/2016.
 */
public class Gamepad extends Controller {
    public Gamepad (BoardObject parent) {
        super(parent);
    }

    @Override
    public void update(float dt) {
        if (Gdx.input.isKeyJustPressed(Input.Keys.UP)) parent.preMove(Direction.up);
        if (Gdx.input.isKeyJustPressed(Input.Keys.DOWN)) parent.preMove(Direction.down);
        if (Gdx.input.isKeyJustPressed(Input.Keys.LEFT)) parent.preMove(Direction.left);
        if (Gdx.input.isKeyJustPressed(Input.Keys.RIGHT)) parent.preMove(Direction.right);
    }
}
