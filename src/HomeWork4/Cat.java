package HomeWork4;

public class Cat extends Animal {

    private static int numb;
    public Cat() {
        numb++;
    }

    public static int counter() {
        return numb;
    }
    @Override
    void run(int distance) {
        if (getDistance() > 200) {
            System.out.println(getName() + " can't run this distance");
        } else {
            super.run(getDistance());
        }
    }

    @Override
    void swim(int distance) {
        if (getDistance() > 0) {
            System.out.println(getName() + " can't swim at all");
        }
    }
}
