import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Player {
    public Vector2D position;
    public Color color;
    private Polygon polygon;
    private List<Vector2D> vertices;
    public Vector2D velocity;
    private Random random;

    public Player(Vector2D position,Vector2D velocity, Color color) {
        this.position = position;
        this.color = color;
        this.velocity = velocity;
        this.random = new Random();
        this.polygon = new Polygon();
        this.vertices = Arrays.asList(
                new Vector2D(),
                new Vector2D(0, 16).rotate(45),
                new Vector2D(20, 8).rotate(45)
        );
        this.vertices.forEach(vector2D -> polygon.addPoint((int)vector2D.x, (int)vector2D.y)); // add cac dinh cua tam giac vao trong polygon
    }

    public void render(Graphics graphics) {
        this.update();
        graphics.setColor(this.color);
        graphics.fillPolygon(this.polygon);
    }

    private void update() {
        this.polygon.reset(); // xoa 3 dinh dau tien di de k bi thanh 6 diem
        Vector2D center = this.vertices
                .stream()
                .reduce(new Vector2D(), (v1, v2) -> v1.add(v2)) //bn trong list dc cong het lai
                .multiply(1.0f / (float)this.vertices.size()); // sau do * 1/3 de tinh dc vector trong tam
        Vector2D translate = position.subtract(center); // lay toa do dich tru di toa do ban dau de ra vector dich
        this.vertices
                .stream()
                .map(vector2D -> vector2D.add(translate)) // duyet tat ca phan tu -> vector se dc cong them mot vector khac
                .forEach(vector2D -> polygon.addPoint((int)vector2D.x, (int)vector2D.y)); // gan cac phan tu vector da dc cong them ben tren vao polygon
    }

    public void run(){
        this.position.addUp(velocity);
        if (this.position.x > 1024){
            position.x = 0;
            position.y = random.nextInt(600);
        }
        else if(this.position.y > 600){
            position.y = 0;
            position.x = random.nextInt(1024);
        }
    }

}
