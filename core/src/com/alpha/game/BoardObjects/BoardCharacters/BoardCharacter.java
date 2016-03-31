package com.alpha.game.BoardObjects.BoardCharacters;

import com.alpha.game.Attacks.Attack;
import com.alpha.game.BoardObjects.Hurtable;
import com.alpha.game.Controllers.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Forer on 3/28/2016.
 */
public class BoardCharacter extends Hurtable {
    private String name;
    Controller control;
    List<Attack> attackList;
    public BoardCharacter(int x, int y, String str, boolean faceLeft) {
        super (x,y,str, faceLeft);
        name = str;
        attackList = new ArrayList<Attack>();
    }

    public BoardCharacter(String str, boolean faceLeft) {
        super (str, faceLeft);
        attackList = new ArrayList<Attack>();
    }

    @Override
    public void update(float dt) {
        if (control != null) control.update(dt);
        if (moving) {
            if (movementPercent>=1.0f) {
                moving = false;
                oldX = 0;
                oldY = 0;
                movementPercent = 0.0f;
            } else {
                lerpPos();
                movementPercent+=dt * 4;
            }
        }
    }

    @Override
    public void die() {
        System.out.println("Oh no " + name + " is dead");
    }

    public void setController(Controller c) {
        control = c;
    }
}
