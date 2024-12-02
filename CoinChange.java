import java.util.concurrent.*;
import java.util.ArrayList;
import java.util.List;

public class CoinChange {
    
    // Method to calculate the number of ways to make sum using coins
    public static int countWays(int[] coins, int sum) throws InterruptedException, ExecutionException {
        // DP array to store the number of ways for each sum
        int[] dp = new int[sum + 1];
        dp[0] = 1; // There's 1 way to make sum 0: using no coins
        
        // Create a thread pool to process the coin combinations concurrently
        ExecutorService executor = Executors.newFixedThreadPool(coins.length);
        List<Callable<Void>> tasks = new ArrayList<>();
        
        // For each coin, create a task that will update the DP array
        for (int coin : coins) {
            tasks.add(() -> {
                for (int i = coin; i <= sum; i++) {
                    synchronized (dp) {
                        dp[i] += dp[i - coin];
                    }
                }
                return null;
            });
        }
        
        // Execute all tasks concurrently
        List<Future<Void>> results = executor.invokeAll(tasks);
        
        // Wait for all tasks to finish
        for (Future<Void> result : results) {
            result.get();
        }
        
        // Shutdown the executor after completion
        executor.shutdown();
        
        // Return the number of ways to make the sum
        return dp[sum];
    }
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Example 1
        int[] coins1 = {1, 2, 3};
        int sum1 = 4;
        int result1 = countWays(coins1, sum1);
        System.out.println("Number of ways to make sum " + sum1 + " is: " + result1); // Expected output: 4

        // Example 2
        int[] coins2 = {2, 5, 3, 6};
        int sum2 = 10;
        int result2 = countWays(coins2, sum2);
        System.out.println("Number of ways to make sum " + sum2 + " is: " + result2); // Expected output: 5
    }
}
