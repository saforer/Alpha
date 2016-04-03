package com.alpha.game.BoardObjects.BoardCharacters.Animations;

import com.badlogic.gdx.graphics.Texture;

public class Animation {
  Texture[] frames;
  int frameIterator = 0;
  
  public Animation (String[] str) {
      frames = new Texture[str.length];
      for (int i = 0; i < str.length; i++) {
          frames[i] = new Texture(str[i]);
      }
  }
}
