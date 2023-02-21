package HomeWork5.ParticipantsObstructions;

public  class Obstruction {

    private int height;
    private int distance;

    public int getHeight() {
        return height;
    }

    public int getDistance() {
        return distance;
    }

    void overcomeWall() {
        System.out.println(getHeight() + " meters wall obstruction overcome.");
    }

    void overcomeDistance() {
        System.out.println(getDistance() + " meters distance obstruction overcome.");
    }

}
