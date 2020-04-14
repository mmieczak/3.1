public class Main {

    public static void main(String[] args) {

        Lamp lamp1 = new Lamp();
        lamp1.type = "Desk lamp";
        lamp1.isTurnedOn = true;
        lamp1.lightingPower = 3;

        Lamp lamp2 = new Lamp();
        lamp2.type = "Ceiling lamp";
        lamp2.isTurnedOn = false;
        lamp2.lightingPower = 0;

        lamp1.showInfo();
        lamp2.showInfo();
    }
}