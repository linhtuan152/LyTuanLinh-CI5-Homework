import java.awt.*;

public class BackgroundRenderer {
    public Vector2D position;


    public BackgroundRenderer (Vector2D position) {
        this.position = position;
    }

    public void render(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect((int) this.position.x,(int) this.position.y, 1024, 600);
    }
}