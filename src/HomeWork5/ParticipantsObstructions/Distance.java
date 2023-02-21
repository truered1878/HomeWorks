package HomeWork5.ParticipantsObstructions;

public class Distance extends Obstruction {


    private int distance;

    public Distance(int distance) {
        this.distance = distance;
    }

    @Override
    public int getDistance() {
        return distance;
    }

    @Override
    void overcomeDistance() {
        super.overcomeDistance();
    }
}



