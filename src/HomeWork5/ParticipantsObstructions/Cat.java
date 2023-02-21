package HomeWork5.ParticipantsObstructions;

public class Cat extends Participant{

    public Cat(String name, int jumpHeight, int runDistance, int runLimit, int jumpLimit) {
        super(name, jumpHeight, runDistance, runLimit, jumpLimit);
    }

    @Override
    void run() {
        super.run();
    }

    @Override
    void jump() {
        super.jump();
    }
}



