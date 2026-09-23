interface RemoteControl {
    void turnOn();
    void turnOff();
}
abstract class Appliance {
    abstract void displayAppliance();
}

class SmartTV extends Appliance implements RemoteControl {
    public void displayAppliance() {
        System.out.println("Appliance: Smart TV");
    }
    public void turnOn() {
        System.out.println("Smart TV is turned ON");
    }
    public void turnOff() {
        System.out.println("Smart TV is turned OFF");
    }
}

public class Dynamic_meth {
    public static void main(String[] args) {
        Appliance a = new SmartTV();
        a.displayAppliance();
        RemoteControl r = (SmartTV) a;
        r.turnOn();
        r.turnOff();
    }
}