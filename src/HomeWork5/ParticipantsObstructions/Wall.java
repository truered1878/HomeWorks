package HomeWork5.ParticipantsObstructions;

public class Wall extends Obstruction {

    private int height;

    public Wall(int height) {
        this.height = height;
    }


    @Override
    public int getHeight() {
        return height;
    }

    @Override
    void overcomeWall() {
        super.overcomeWall();
    }
}
