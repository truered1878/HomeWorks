package HomeWork4;

public class Dog extends Animal{

    private static int numb;
    public Dog() {
        numb++;
    }

    public static int counter() {
        return numb;
    }

    @Override
    void run(int distance) {
        if (getDistance() > 500) {
            System.out.println(getName() + " can't run this distance");
        } else {
            super.run(getDistance());
        }
    }

    @Override
    void swim(int distance) {
        if (getDistance() > 10) {
            System.out.println(getName() + " can't swim this distance");
        } else
            super.swim(getDistance());
    }
}
