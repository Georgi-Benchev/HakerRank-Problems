package oneWeekPreperationKit;

import java.util.List;

public class TruckTourStartPoint {
    public static int truckTour(List<List<Integer>> petrolpumps) {

        int startIndex = 0;
        int deficit = 0;
        int currentFuel = 0;

        for (int i = 0; i < petrolpumps.size(); i++) {
            int petrol = petrolpumps.get(i).get(0);
            int distance = petrolpumps.get(i).get(1);

            currentFuel += petrol - distance;

            if (currentFuel < 0) {
                deficit += currentFuel;
                currentFuel = 0;
                startIndex = i + 1;
            }
        }

        if (currentFuel + deficit > 0){
            return startIndex;
        }


        return -1;
    }
}
