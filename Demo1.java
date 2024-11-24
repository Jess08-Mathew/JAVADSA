// Interface definition
interface WaterConservationSystem {
    int calculateTrappedWater(int[] blockHeights); // Abstract method to calculate trapped water
}

// Abstract class implementing the interface
abstract class RainySeasonConservation implements WaterConservationSystem {
    // Optionally, shared logic or attributes can be added here
}

// Class that extends the abstract class and provides the concrete implementation
class CityBlockConservation extends RainySeasonConservation {

    // Concrete implementation of calculateTrappedWater method
    @Override
    public int calculateTrappedWater(int[] blockHeights) {
        int n = blockHeights.length;
        if (n <= 2) {
            return 0; // No water can be trapped if there are less than 3 blocks
        }

        // Arrays to store the maximum height to the left and right of each block
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Calculate leftMax array
        leftMax[0] = blockHeights[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], blockHeights[i]);
        }

        // Calculate rightMax array
        rightMax[n - 1] = blockHeights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], blockHeights[i]);
        }

        // Calculate the total trapped water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - blockHeights[i];
        }

        return trappedWater;
    }
}

// Main class to test the functionality
public class Demo1 {
    public static void main(String[] args) {
        // Create an object of CityBlockConservation
        CityBlockConservation conservationSystem = new CityBlockConservation();

        // Test case 1
        int[] blocks1 = {3, 0, 0, 2, 0, 4};
        System.out.println("Test Case 1: Total Trapped Water = " + conservationSystem.calculateTrappedWater(blocks1));

        // Test case 2
        int[] blocks2 = {3, 0, 2, 0, 4};
        System.out.println("Test Case 2: Total Trapped Water = " + conservationSystem.calculateTrappedWater(blocks2));
    }
}

