import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameCanvas extends JPanel {

    private BackGround backGround;
    private List<Enemy> enemies;
    private int count = 0;
    private BufferedImage backBuffered;
    private Graphics graphics;
    private Random random;

    public GameCanvas() {
        // Set size
        this.setSize(1024, 600);
        this.setupBackBuffered();
        this.enemies = new ArrayList<>();
        this.random = new Random();
        this.setVisible(true);
    }

    private void setupBackBuffered() {
        this.backBuffered = new BufferedImage(1024, 600, BufferedImage.TYPE_4BYTE_ABGR);
        this.graphics = this.backBuffered.getGraphics();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(this.backBuffered, 0, 0, null);
    }

    public void renderAll() {
        backGround.drawBackground(graphics);
        this.enemies.forEach(enermy -> enermy.render(graphics));
        this.repaint();
    }



    public void runAll() {
        // cap nhat tat ca moi thu
        this.createEnemy();
        this.enemies.forEach(enermy -> enermy.run());
        this.backGround = new BackGround(0,0,1024,600,Color.black);
    }

    private void createEnemy() {
        if (count == 30){
        Enemy enemy = new Enemy(0, this.random.nextInt(600), this.loadImage("resources/images/circle.png"), 5, 5, this.random.nextInt(2) + 1);
        this.enemies.add(enemy);
        this.count = 0;}
        else {
        this.count +=1;
        }
    }


    private BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
