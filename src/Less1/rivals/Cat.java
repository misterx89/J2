package Less1.rivals;

public class Cat implements Rival{
    String name;

    private int maxRun;
    private int maxJump;

    private boolean onDist;

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.onDist = true;
    }

    public Cat (String name) {
        this (name,1000,2);
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRun){
            System.out.println("Кот по имени: " + name + " успешно прошел дистанцию в " + dist + "м.");
        } else {
            System.out.println("Кот по имени: " + name + " не прошел дистанцию в " + dist + "м.");
            onDist = false;
        }
    }

    @Override
    public void jump(int hight) {
        if (hight <= maxJump){
            System.out.println("Кот по имени: " + name + " успешно прыгнул на " + hight + "м.");
        } else {
            System.out.println("Кот по имени: " + name + " не перепрыгнул " + hight + "м.");
            onDist = false;
        }
    }

    @Override
    public boolean isOnActive() {
        return onDist;
    }

    @Override
    public void info() {
        System.out.println(name + " В игре: " + onDist);
    }
}
