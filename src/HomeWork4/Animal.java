package HomeWork4;

public class Animal {

    private static int numb;
    public Animal() {
        numb++;
    }

    public static int counter() {
        return numb;
    }

    private String name;

    private int distance;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void run(int distance) {
        System.out.println(getName() + " ran " + getDistance() + " meters");
    }

    void swim(int distance) {
        System.out.println(getName() + " swam " + distance + " meters");
    }
}

