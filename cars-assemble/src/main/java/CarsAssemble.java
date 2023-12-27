public class CarsAssemble {
    final int CARS_PRODUCED_PER_HOUR = 221;
    final int MINUTES_IN_A_HOUR = 60;
    double SuccessRateArr[] = {0,1, 1, 1, 1, 0.9, 0.9, 0.9, 0.9, 0.8, 0.77};


    public double productionRatePerHour(int speed) {
        return speed * CARS_PRODUCED_PER_HOUR * SuccessRateArr[speed];
    }

    public int workingItemsPerMinute(int speed) {
        double result = speed * CARS_PRODUCED_PER_HOUR * SuccessRateArr[speed];
        return (int)result/MINUTES_IN_A_HOUR;
    }
}
