package HomeWork5.ParticipantsObstructions;

public class Participant {

    private int runLimit;
    private int jumpLimit;
    private String name;
    private int jumpHeight;
    private int runDistance;

    public Participant(String name, int jumpHeight, int runDistance, int runLimit, int jumpLimit) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }


    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    void run() {
        System.out.println(getName() + " run " + getRunDistance() + " meters distance.");
    }

    void jump() {
        System.out.println(getName() + " jump " + getJumpHeight() + " meters over the wall.");
    }

    void fail() {
        System.out.println(getName() + " out of competition.");
    }
}
