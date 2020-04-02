package homework6;

public class Animal {
    private String name;
    private int maxRunningDistance;
    private int maxSwimmingDistance;
    private double maxJumpingHigh;

    public Animal(String name, int maxRunningDistance, int maxSwimmingDistance, double maxJumpingHigh) {
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
        this.maxSwimmingDistance = maxSwimmingDistance;
        this.maxJumpingHigh = maxJumpingHigh;
    }

    public String getName() {
        return name;
    }

    public boolean run(int distance) {
        if (distance <= maxRunningDistance) {
            return true;
        } else {
            return false;
        }
    }

    public boolean swim(int distance) {
        if (distance <= maxSwimmingDistance) {
            return true;
        } else {
            return false;
        }
    }

    public boolean jump(double high) {
        if (high <= maxJumpingHigh) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", maxRunningDistance=" + maxRunningDistance +
                ", maxSwimmingDistance=" + maxSwimmingDistance +
                ", maxJumpingHigh=" + maxJumpingHigh +
                '}';
    }
}
