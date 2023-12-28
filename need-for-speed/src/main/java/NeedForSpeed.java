class NeedForSpeed {

    private int speed = 0;
    private int batteryDrain = 2;
    private int batteryPercentage;
    private int distanceDriven;


    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        batteryPercentage = 100;
        distanceDriven = 0;
    }

    public boolean batteryDrained() {
        return batteryPercentage == 0;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            distanceDriven += speed;
            batteryPercentage -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    private int raceTrackDistance = 800;

    RaceTrack(int distance) {

        this.raceTrackDistance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained()) {
            car.drive();
        }

        return car.distanceDriven() >= raceTrackDistance;
    }
}
