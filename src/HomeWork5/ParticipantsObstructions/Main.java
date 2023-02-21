package HomeWork5.ParticipantsObstructions;


public class Main {
    public static void main(String[] args) {

        Participant[] participantsArray = new Participant[3];
        participantsArray[0] = new Human("Chelovek",20,500, 1000, 50);
        participantsArray[1] = new Cat("Murzik", 20, 200, 200, 20);
        participantsArray[2] = new Robot("Rexy",15, 150, 151, 16);

        Obstruction[] obstructionsArray = new Obstruction[2];
        obstructionsArray[0] = new Wall(15);
        obstructionsArray[1] = new Distance(150);

        if (participantsArray[0].getJumpHeight() <= participantsArray[0].getJumpLimit() &&
                participantsArray[0].getRunDistance() <= participantsArray[0].getRunLimit() &&
                participantsArray[0].getJumpHeight() >= obstructionsArray[0].getHeight() &&
                participantsArray[0].getRunDistance() >= obstructionsArray[1].getDistance()) {
            participantsArray[0].jump();
            obstructionsArray[0].overcomeWall();
            participantsArray[0].run();
            obstructionsArray[1].overcomeDistance();
        } else {
            participantsArray[0].fail();
        }

        System.out.println("--------------------------");

        if (participantsArray[1].getJumpHeight() <= participantsArray[1].getJumpLimit() &&
                participantsArray[1].getRunDistance() <= participantsArray[1].getRunLimit() &&
                participantsArray[1].getJumpHeight() >= obstructionsArray[0].getHeight() &&
                participantsArray[1].getRunDistance() >= obstructionsArray[1].getDistance()) {
            participantsArray[1].jump();
            obstructionsArray[0].overcomeWall();
            participantsArray[1].run();
            obstructionsArray[1].overcomeDistance();
        } else {
            participantsArray[1].fail();
        }

        System.out.println("--------------------------");

        if (participantsArray[2].getJumpHeight() <= participantsArray[2].getJumpLimit() &&
                participantsArray[2].getRunDistance() <= participantsArray[2].getRunLimit() &&
                participantsArray[2].getJumpHeight() >= obstructionsArray[0].getHeight() &&
                participantsArray[2].getRunDistance() >= obstructionsArray[1].getDistance()) {
            participantsArray[2].jump();
            obstructionsArray[0].overcomeWall();
            participantsArray[2].run();
            obstructionsArray[1].overcomeDistance();
        } else {
            participantsArray[2].fail();
        }




    }
}