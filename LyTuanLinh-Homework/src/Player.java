import java.awt.*;
import java.util.Random;

public class Player {
    public Vector2D position;
    public PolygonRenderer renderer;
    public PlayerMove playerMove;
    public Bullet bullet;

    public Player() {
        this.position = new Vector2D();
        this.renderer = new PolygonRenderer(Color.RED,
                new Vector2D(),
                new Vector2D(0, 16),
                new Vector2D(20, 8)
        );
        this.playerMove = new PlayerMove();
        this.bullet = new Bullet();
    }

    public void run() {
        this.playerMove.run(this);
        this.renderer.angle = this.playerMove.angle;
        this.bullet.run();
    }

    public void render(Graphics graphics) {
        this.renderer.render(graphics, this.position);
        this.bullet.render(graphics);
    }
}
