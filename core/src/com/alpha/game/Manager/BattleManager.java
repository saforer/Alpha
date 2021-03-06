package com.alpha.game.Manager;

import com.alpha.game.BoardObjects.BoardCharacters.Enemies.Enemy;
import com.alpha.game.BoardObjects.BoardCharacters.Enemies.MetEnemy;
import com.alpha.game.BoardObjects.BoardCharacters.Players.MetPlayer;
import com.alpha.game.BoardObjects.BoardCharacters.Players.Player;
import com.alpha.game.Controllers.AIs.EnemyAIS.BabyAI;
import com.alpha.game.Controllers.Gamepads.Gamepad;
import com.alpha.game.Grids.Grid;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Forer on 3/28/2016.
 */
public class BattleManager {
    static BattleManager i;


    static Grid currentGrid;


    BattleManager() {
        currentGrid = new Grid();
        Player tempObject = new MetPlayer();
        tempObject.setController(new Gamepad(tempObject));
        currentGrid.addObject(0, 0, tempObject);
        Enemy tempEnemy = new MetEnemy();
        tempEnemy.setController(new BabyAI(tempEnemy));
        currentGrid.addObject(5,0,tempEnemy);
    }

    public static BattleManager getI() {
        if (i == null) i = new BattleManager();
        return i;
    }
    
    public static Grid getCurrentGrid() {
        return currentGrid;
    }

    public void update(float dt) {
        currentGrid.update(dt);
    }

    public void draw(SpriteBatch sb) {
        currentGrid.draw(sb);
    }
}
