package com.alpha.game.Controllers.AIs.EnemyAIS;

import com.alpha.game.BoardObjects.BoardObject;
import com.alpha.game.BoardObjects.Direction;
import com.alpha.game.Controllers.AIs.AI;

import java.util.Random;

/**
 * Created by Forer on 3/31/2016.
 */
public class BabyAI extends AI {
    float timer = 0;
    public BabyAI (BoardObject parent) {
        super(parent);
    }

    public void update(float dt) {
        if (timer > 1.0f) {
            int toMove = new Random().nextInt(Direction.values().length);
            Direction toDirection = Direction.values()[toMove];
            System.out.println("Moving " + toDirection.toString());
            parent.preMove(toDirection);
            timer = 0.0f;
        } else {
            timer += dt;
        }
    }
}
