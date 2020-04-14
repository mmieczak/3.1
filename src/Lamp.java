public class Lamp {
    String type;
    boolean isTurnedOn;
    int lightingPower;

    Lamp(String t, boolean status, int power) {
        type = t;
        isTurnedOn = status;
        lightingPower = power;
    }

    void showInfo() {
        System.out.println("Lamp type: " + type);
        System.out.println("Is turned on: " + isTurnedOn);
        System.out.println("Lighting power: " + lightingPower);
    }
}