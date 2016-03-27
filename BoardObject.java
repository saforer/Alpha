public class BoardObject {
  private int gridX;
  private int gridY;
  private Texture icon;
  
  public BoardObject (int x, int y, String str) {
    gridX = x;
    gridY = y;
    icon = new Texture(str);
  }
  
  void loadStatic() {
    normal = new Texture("normalTile.png");
  }

  public void update(float dt) {
    
  }
  
  public void draw(SpriteBatch sb) {
    int tileSize = 32;
    sb.draw(icon, gridX * tileSize, gridY * tileSize);
  }
}
