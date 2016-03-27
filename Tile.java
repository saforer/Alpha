public class Tile {
  private int gridX;
  private int gridY;
  private Texture icon;
  private State tileState;
  
  //Static textures to load
  private static Texture normalTile;
  
  public Tile (int x, int y) {
    gridX = x;
    gridY = y;
    if (normal == null) {
      loadStatic();
    }
    updateTile(); 
  }
  
  void loadStatic() {
    normal = new Texture("normalTile.png");
  }
  
  void updateIcon() {
    switch (tileState) {
      default:
        icon = normalTile;
    }
  }
  
  public void update(float dt) {
    
  }
  
  public void draw(SpriteBatch sb) {
    int tileSize = 32;
    sb.draw(icon, gridX * tileSize, gridY * tileSize);
  }
}
