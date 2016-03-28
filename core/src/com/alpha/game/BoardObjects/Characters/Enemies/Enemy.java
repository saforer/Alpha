package com.alpha.game.BoardObjects.Characters.Enemies;

/**
 * Created by Forer on 3/28/2016.
 */
public class Enemy extends com.alpha.game.BoardObjects.Characters.Character {
    public Enemy(int x, int y, String str, boolean faceLeft) {
        super (x,y,str, faceLeft);
    }

    @Override
    public void die() {
        System.out.println("Oh no enemy is dead");
    }
}
