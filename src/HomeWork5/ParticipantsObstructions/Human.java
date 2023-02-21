package HomeWork5.ParticipantsObstructions;

public class Human extends Participant {

    public Human(String name, int jumpHeight, int runDistance, int runLimit, int jumpLimit) {
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
