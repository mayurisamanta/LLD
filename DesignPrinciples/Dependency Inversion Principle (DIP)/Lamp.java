public class Lamp implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Lamp turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Lamp turned off");
    }
}
