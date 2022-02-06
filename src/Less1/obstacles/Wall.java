package Less1.obstacles;

import Less1.rivals.Rival;

public class Wall implements Obstacles{
    private int hight;

    public Wall(int hight) {
        this.hight = hight;
    }

    @Override
    public void process(Rival r) {
        r.jump(hight);
    }
}
