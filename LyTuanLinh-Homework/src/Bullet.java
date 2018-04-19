import java.awt.*;
import java.util.Random;

public class Bullet {
    public Vector2D position;
    public PolygonRenderer renderer;
    public PlayerMove playerMove;

    public Bullet() {
        this.position = new Vector2D();
        this.renderer = new PolygonRenderer(Color.YELLOW,
                new Vector2D(),
                new Vector2D(0, 16)
        );
        this.playerMove = new PlayerMove();
    }

    public void run() {
        this.position.addUp(this.playerMove.velocity);
    }

    public void render(Graphics graphics) {
        this.renderer.render(graphics, this.position);
    }
}