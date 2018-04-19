import java.awt.*;

public class Background {
    public Vector2D position;
    private BackgroundRenderer renderer;


    public Background() {
        this.position = new Vector2D();
        this.renderer = new BackgroundRenderer(this.position);
    }

    public void render(Graphics graphics) {
        this.renderer.render(graphics);
    }
}
