import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class EnemyShoot {

    public List<BulletEnemy> bulletEnemies;
//    public boolean isPlayerShoot = false;
    private FrameCounter frameCounter;

    public EnemyShoot() {
        this.bulletEnemies = new ArrayList<>();
        this.frameCounter = new FrameCounter(150);
    }

    public void run(Enemy enemy) {
//        if (this.isPlayerShoot) {
          if (this.frameCounter.run()) {
              for (int i = 0; i < 12; i ++){
                  BulletEnemy bulletEnemy = new BulletEnemy();
                  bulletEnemy.position.set(enemy.position);
                  Vector2D vector2D = new Vector2D(7, 0);
                  Vector2D rotate = vector2D.rotate(i*30);
                  bulletEnemy.velocity.set(rotate);
                  this.bulletEnemies.add(bulletEnemy);
                  this.frameCounter.reset();
              }
          }
    }
}

