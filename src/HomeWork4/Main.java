package HomeWork4;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setName("Barsik");
        dog.setDistance(11);
        dog.run(dog.getDistance());
        dog.setDistance(4);
        dog.swim(dog.getDistance());

        Cat cat = new Cat();
        cat.setName("Murzik");
        cat.setDistance(133);
        cat.run(cat.getDistance());
        cat.setDistance(100);
        cat.swim(cat.getDistance());

        System.out.println("Cats created: " + Cat.counter());
        System.out.println("Dogs created: " + Cat.counter());
        System.out.println("Animals created: " + Animal.counter());
    }
}