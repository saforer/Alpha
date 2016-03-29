package com.alpha.game.BoardObjects;

/**
 * Created by Forer on 3/28/2016.
 */
public class Hurtable extends BoardObject {
    int hp = 10;
    public Hurtable(String str, boolean faceLeft) {super (str, faceLeft);}
    public Hurtable(int x, int y, String str, boolean faceLeft) {
        super(x, y, str, faceLeft);
    }

    public void damage(int amount) {
        hp--;
        if (hp<=0) die();
    }

    public void die() {
        System.out.println("Oh no I am dead");
    }
}
