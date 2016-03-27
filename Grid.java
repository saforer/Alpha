public class Grid {
  Tile[][] tileArray;
  BoardObject[][] objArray;
  final int width = 6;
  final int height = 3;
  
  public Grid () {
    tileArray = new Tile[width][height];
    objArray = new BoardObject[width][height];
    
    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        tileArray[x][y] = new Tile(x,y);
      }
    }
  }
  
  public void update(float dt) {
    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        tileArray[x][y].update(dt);
      }
    }
    
    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        if (objArray[x][y] != null) objArray[x][y].update(dt);
      }
    }
  }
  
  public void draw(SpriteBatch sb) {
    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        tileArray[x][y].draw(sb);
      }
    }
    
    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        if (objArray[x][y] != null) objArray[x][y].draw(sb);
      }
    }
  }
}
