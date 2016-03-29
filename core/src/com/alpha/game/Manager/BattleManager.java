package com.alpha.game.Manager;

import com.alpha.game.BoardObjects.BoardCharacters.Players.MetPlayer;
import com.alpha.game.Grids.Grid;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Forer on 3/28/2016.
 */
public class BattleManager {
    static BattleManager i;


    Grid currentGrid;


    BattleManager() {
        currentGrid = new Grid();
        currentGrid.addObject(0,0,new MetPlayer(false));
    }

    public static BattleManager getI() {
        if (i == null) i = new BattleManager();
        return i;
    }

    public void update(float dt) {
        currentGrid.update(dt);
    }

    public void draw(SpriteBatch sb) {
        currentGrid.draw(sb);
    }
}
