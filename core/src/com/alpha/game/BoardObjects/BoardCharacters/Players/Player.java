package com.alpha.game.BoardObjects.BoardCharacters.Players;

import com.alpha.game.BoardObjects.BoardCharacters.BoardCharacter;

/**
 * Created by Forer on 3/28/2016.
 */
public class Player extends BoardCharacter {
    public Player(String str) {super (str, true);}
    public Player(int x, int y, String str, boolean faceLeft) {
        super (x,y,str, faceLeft);
    }

    @Override
    public void die() {
        System.out.println("Oh no player is dead");
    }
}
