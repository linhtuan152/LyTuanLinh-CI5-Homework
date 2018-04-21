import java.awt.*;

public class BulletPlayer extends GameObject {

    public Vector2D velocity;

    // constructor
    public BulletPlayer() {
        this.velocity = new Vector2D();
        this.renderer = new ImageRenderer("resources/images/star.png", 5, 5);
    }
    @Override
    public void run() {
        super.run();
        this.position.addUp(this.velocity);
    }
}
