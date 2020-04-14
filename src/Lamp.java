public class Lamp {
    String type;
    boolean isTurnedOn;
    int lightingPower;

    void showInfo() {
        System.out.println("Lamp type: " + type);
        System.out.println("Is turned on: " + isTurnedOn);
        System.out.println("Lighting power: " + lightingPower);
    }
}

