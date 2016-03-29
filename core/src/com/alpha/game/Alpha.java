package com.alpha.game;

import com.alpha.game.Manager.BattleManager;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Alpha extends ApplicationAdapter {
	SpriteBatch batch;
	BattleManager  bm;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		bm = BattleManager.getI();
	}

	@Override
	public void render () {
		bm.update(Gdx.graphics.getDeltaTime());

		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		bm.draw(batch);
		batch.end();
	}
}
