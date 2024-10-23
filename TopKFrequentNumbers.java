import java.util.*;
public class TopKFrequentNumbers {
    static int[] numbers;

    public static void findTopKFrequentNumbers(int K) {
        // Step 1: Calculate the frequency of each number
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a priority queue (min-heap)
        PriorityQueue<int[]> heap = new PriorityQueue<>(
            (a, b) -> a[1] == b[1] ? Integer.compare(b[0], a[0]) : Integer.compare(b[1], a[1])
        );

        // Step 3: Add all elements from the frequency map to the heap
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            heap.offer(new int[]{entry.getKey(), entry.getValue()});
        }

        // Step 4: Extract the top K elements
        for (int i = 0; i < K; i++) {
            int[] top = heap.poll();
            System.out.print(top[0] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test Case 1
        numbers = new int[]{8, 9, 9, 8, 7, 7, 7};
        System.out.print("Test Case 1: ");
        findTopKFrequentNumbers(2);

        // Test Case 2
        numbers = new int[]{1, 2, 3, 4, 5, 6};
        System.out.print("Test Case 2: ");
        findTopKFrequentNumbers(3);

        // Test Case 3
        numbers = new int[]{10, 10, 10, 20, 20, 30};
        System.out.print("Test Case 3: ");
        findTopKFrequentNumbers(2);

        // Test Case 4
        numbers = new int[]{5, 5, 5, 4, 4, 3, 3, 3, 2, 2, 1};
        System.out.print("Test Case 4: ");
        findTopKFrequentNumbers(3);

        // Test Case 5 (Edge Case)
        numbers = new int[]{1};
        System.out.print("Test Case 5: ");
        findTopKFrequentNumbers(1);

        // Test Case 6 (Large Values)
        numbers = new int[]{1000, 1001, 1000, 1002, 1000, 1001};
        System.out.print("Test Case 6: ");
        findTopKFrequentNumbers(2);

        // Test Case 7 (All Elements Same)
        numbers = new int[]{7, 7, 7, 7, 7, 7, 7};
        System.out.print("Test Case 7: ");
        findTopKFrequentNumbers(1);

        // Test Case 8 (Negative Numbers)
        numbers = new int[]{-1, -1, -2, -2, -3, -1};
        System.out.print("Test Case 8: ");
        findTopKFrequentNumbers(2);

        // Test Case 9
        numbers = new int[]{10, 20, 20, 30, 30, 40};
        System.out.print("Test Case 9: ");
        findTopKFrequentNumbers(3);

        // Test Case 10 (Single Element Array with K=1)
        numbers = new int[]{999};
        System.out.print("Test Case 10: ");
        findTopKFrequentNumbers(1);
    }
}
