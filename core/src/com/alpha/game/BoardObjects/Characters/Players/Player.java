package com.alpha.game.BoardObjects.Characters.Players;

/**
 * Created by Forer on 3/28/2016.
 */
public class Player extends com.alpha.game.BoardObjects.Characters.Character {
    public Player(int x, int y, String str) {
        super (x,y,str);
    }

    @Override
    public void die() {
        System.out.println("Oh no player is dead");
    }
}