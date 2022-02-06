package Less1;

import Less1.obstacles.Obstacles;
import Less1.obstacles.Road;
import Less1.obstacles.Wall;
import Less1.rivals.Cat;
import Less1.rivals.Human;
import Less1.rivals.Rival;
import Less1.rivals.Robot;

public class Main {
    public static void main(String[] args) {
        Rival[] rivals = {
                new Cat("Барсик",1000,3),
                new Robot("Terminator", 10000, 0),
                new Human("Иван", 900,2)
        };
        Obstacles[] obstacles = {
                new Road(1000),
                new Wall(2)
        };
        for (Rival r: rivals) {
            for (Obstacles o: obstacles) {
                o.process(r);
                if (!r.isOnActive()){
                    break;
                }
            }
        }
        for (Rival rival: rivals) {
            rival.info();
        }
    }


}
