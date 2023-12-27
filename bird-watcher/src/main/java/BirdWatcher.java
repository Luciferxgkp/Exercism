
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int NumberOfBirds = 0;
        for (int i = 0; i < Math.min(7, numberOfDays); i++) {
            NumberOfBirds += birdsPerDay[i];
        }
        return NumberOfBirds;
    }

    public int getBusyDays() {
        int NumberOfBusyDays = 0;
        for (int birds : birdsPerDay) {
            if (birds >= 5) {
                NumberOfBusyDays++;
            }
        }
        return NumberOfBusyDays;
    }
}
