package com.alpha.game.BoardObjects.Characters;

import com.alpha.game.Attacks.Attack;
import com.alpha.game.BoardObjects.Hurtable;
import com.alpha.game.Controllers.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Forer on 3/28/2016.
 */
public class Character extends Hurtable {
    private String name;
    Controller control;
    List<Attack> attackList;
    public Character (int x, int y, String str) {
        super (x,y,str);
        name = str;
        attackList = new ArrayList<Attack>();
    }

    @Override
    public void die() {
        System.out.println("Oh no " + name + " is dead");
    }
}
