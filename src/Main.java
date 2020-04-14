public class Main {

    public static void main(String[] args) {

        Lamp lamp1 = new Lamp("Desk lamp", true, 3);
        Lamp lamp2 = new Lamp("Ceiling lamp", false, 0);

        lamp1.showInfo();
        lamp2.showInfo();
    }
}