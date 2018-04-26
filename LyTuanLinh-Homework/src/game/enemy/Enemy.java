package game.enemy;

import base.GameObject;
import physic.BoxCollider;
import renderer.ImageRenderer;

public class Enemy extends GameObject {
    public EnemyMove enemyMove;
    public BoxCollider boxCollider;

    public Enemy() {
        this.enemyMove = new EnemyMove();
        this.renderer = new ImageRenderer("resources/images/circle.png", 20, 20);
        this.boxCollider = new BoxCollider(20, 20);
    }

    @Override
    public void run() {
        super.run();
        this.enemyMove.run(this);
        this.boxCollider.position.set(this.position);
    }

    public void getHit() {
        this.isAlive = false;
    }
}
