package com.alpha.game.Tiles;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Forer on 3/28/2016.
 */
public class Tile {
    private int gridX;
    private int gridY;
    private Texture icon;
    private int state;
    private boolean friendlyTeam = true;

    //Static textures to load
    private static Texture friendlyNormal;
    private static Texture enemyNormal;

    public Tile (int x, int y, boolean friendlyTeam) {
        gridX = x;
        gridY = y;
        this.friendlyTeam = friendlyTeam;
        if (friendlyNormal == null) {
            loadStatic();
        }
        updateIcon();
    }

    void loadStatic() {
        friendlyNormal = new Texture("friendlyTile.png");
        enemyNormal = new Texture("enemyTile.png");
    }

    void updateIcon() {
        if (friendlyTeam) {
            switch (state) {
                default:
                    icon = friendlyNormal;
                    break;
            }
        } else {
            switch (state) {
                default:
                    icon = enemyNormal;
                    break;
            }
        }
    }

    public void update(float dt) {

    }

    public void draw(SpriteBatch sb) {
        float scale = 3;
        int width = 40;
        int height = 25;
        sb.draw(icon, (gridX * width) * scale, (gridY * height) * scale, icon.getWidth() * scale, icon.getHeight() * scale);
    }

    public boolean isFriendly() {
        return friendlyTeam;
    }
}
