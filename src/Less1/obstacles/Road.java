package Less1.obstacles;

import Less1.rivals.Rival;

public class Road implements Obstacles{
    private int dist;

    public Road(int dist) {
        this.dist = dist;
    }

    @Override
    public void process(Rival r) {
        r.run(dist);
    }
}
