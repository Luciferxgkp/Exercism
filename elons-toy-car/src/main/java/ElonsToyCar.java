public class ElonsToyCar {

    private static int DistanceDriven;
    private static int BatteryPercentage;

    public ElonsToyCar() {
        DistanceDriven = 0;
        BatteryPercentage = 100;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + DistanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (BatteryPercentage == 0) {
            return "Battery empty";
        }
        return "Battery at " + BatteryPercentage + "%";
    }

    public void drive() {
        if (BatteryPercentage == 0) return;
        BatteryPercentage--;
        DistanceDriven += 20;
    }
}
