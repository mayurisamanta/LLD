public class Main {

    public static void main(String[] args) {
        Switchable lamp = new Lamp();
        Switchable fan = new Fan();

        Switch lightSwitch = new Switch(lamp);
        Switch fanSwitch = new Switch(fan);

        lightSwitch.turnOn();
        lightSwitch.turnOff();

        fanSwitch.turnOn();
        fanSwitch.turnOff();
    }

    // Here, the Switch class is not dependent on the Lamp and Fan classes.
    // Instead, it is dependent on the Switchable interface.
    // This way, the Switch class can work with any class that implements the Switchable interface.
    // This is an example of the Dependency Inversion Principle.
}
