abstract class Robber {
    // Default method to print the MScAI&ML program
    void RobbingClass() {
        System.out.println("MScAI&ML");
    }

    // Default method to print love for Machine Learning
    void MachineLearning() {
        System.out.println("I love MachineLearning.");
    }

    // Abstract methods for each type of house robbing strategy
    abstract int RowHouses(int[] houses);
    abstract int RoundHouses(int[] houses);
    abstract int SquareHouse(int[] houses);
    abstract int MultiHouseBuilding(int[][] houses);
}

class JAVAProfessionalRobber extends Robber {
    // RowHouses: Maximize the amount robbed without robbing two adjacent houses
    int RowHouses(int[] houses) {
        if (houses.length == 0) return 0;
        int prev2 = 0, prev1 = 0;
        for (int house : houses) {
            int curr = Math.max(prev1, prev2 + house);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    // RoundHouses: Treats houses as circular, max robbery without robbing adjacent houses
    int RoundHouses(int[] houses) {
        if (houses.length == 0) return 0;
        if (houses.length == 1) return houses[0];
        return Math.max(rob(houses, 0, houses.length - 2), rob(houses, 1, houses.length - 1));
    }

    // Helper function for RoundHouses to calculate max amount
    private int rob(int[] houses, int start, int end) {
        int prev2 = 0, prev1 = 0;
        for (int i = start; i <= end; i++) {
            int curr = Math.max(prev1, prev2 + houses[i]);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    // SquareHouse: Maximize the amount robbed without robbing adjacent square houses
    int SquareHouse(int[] houses) {
        if (houses.length == 0) return 0;
        int prev2 = 0, prev1 = 0;
        for (int house : houses) {
            int curr = Math.max(prev1, prev2 + house);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    // MultiHouseBuilding: Maximize amount robbed from a multi-type building array
    int MultiHouseBuilding(int[][] houses) {
        int totalMax = 0;
        for (int[] houseType : houses) {
            totalMax += SquareHouse(houseType);
        }
        return totalMax;
    }
}

public class Main {
    public static void main(String[] args) {
        JAVAProfessionalRobber robber = new JAVAProfessionalRobber();

        robber.RobbingClass(); // Print "MScAI&ML"
        robber.MachineLearning(); // Print "I love MachineLearning."

        // Test cases
        System.out.println("RowHouses([1,2,3,0]) -> " + robber.RowHouses(new int[]{1, 2, 3, 0}));
        System.out.println("RoundHouses([1,2,3,4]) -> " + robber.RoundHouses(new int[]{1, 2, 3, 4}));
        System.out.println("SquareHouse([5,10,2,7]) -> " + robber.SquareHouse(new int[]{5, 10, 2, 7}));
        System.out.println("MultiHouseBuilding([[5,3,8,2],[10,12,7,6],[4,9,11,5],[8,6,3,7]]) -> " +
                robber.MultiHouseBuilding(new int[][]{{5, 3, 8, 2}, {10, 12, 7, 6}, {4, 9, 11, 5}, {8, 6, 3, 7}}));
    }
}
