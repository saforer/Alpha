package com.alpha.game.BoardObjects.Characters.Enemies;

/**
 * Created by Forer on 3/28/2016.
 */
public class Enemy extends com.alpha.game.BoardObjects.Characters.Character {
    public Enemy(int x, int y, String str) {
        super (x,y,str);
    }

    @Override
    public void die() {
        System.out.println("Oh no enemy is dead");
    }
}
