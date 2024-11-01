public class ShareTrader {
    static int maxProfit = 0; // Static variable to store maximum profit

    // Static method to find maximum profit
    public static void findMaxProfit(int[] prices) {
        // Validate input
        if (prices == null || prices.length < 2) {
            System.out.println("Not enough prices to determine profit.");
            return;
        }

        // Calculate maximum profit with up to two transactions
        int firstBuy = Integer.MIN_VALUE; // Profit after first buy
        int firstSell = 0; // Profit after first sell
        int secondBuy = Integer.MIN_VALUE; // Profit after second buy
        int secondSell = 0; // Profit after second sell

        for (int price : prices) {
            // Update the profit after the first buy and sell
            firstBuy = Math.max(firstBuy, -price);
            firstSell = Math.max(firstSell, firstBuy + price);

            // Update the profit after the second buy and sell
            secondBuy = Math.max(secondBuy, firstSell - price);
            secondSell = Math.max(secondSell, secondBuy + price);
        }

        // The maximum profit after two transactions
        maxProfit = secondSell;

        System.out.println("Maximum Profit: " + maxProfit);
    }

    public static void main(String[] args) {
        // Test case 1
        int[] prices1 = {10, 22, 5, 75, 65, 80};
        System.out.print("Test Case 1: ");
        findMaxProfit(prices1); // Output: 87

        // Test case 2
        int[] prices2 = {2, 30, 15, 10, 8, 25, 80};
        System.out.print("Test Case 2: ");
        findMaxProfit(prices2); // Output: 100

        // Additional test cases
        int[] prices3 = {3, 2, 6, 5, 0, 3};
        System.out.print("Test Case 3: ");
        findMaxProfit(prices3); // Output: 7

        int[] prices4 = {1, 2, 3, 4, 5};
        System.out.print("Test Case 4: ");
        findMaxProfit(prices4); // Output: 4

        int[] prices5 = {5, 4, 3, 2, 1};
        System.out.print("Test Case 5: ");
        findMaxProfit(prices5); // Output: 0
    }
}

