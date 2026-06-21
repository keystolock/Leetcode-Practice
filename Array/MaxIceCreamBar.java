public class MaxIceCreamBar {


    public int maxIceCream(int[] costs, int coins) {
        int arr[] = new int[100001];
        int n = costs.length;
        
        // Count frequency of each cost
        for (int i = 0; i < n; i++) {
            arr[costs[i]]++;
        }
        
        int count = 0;
        
        // Greedy approach: buy cheapest first
        for (int i = 0; i < 100001; i++) {
            if (arr[i] > 0) {
                int x = coins / i;
                if (x <= arr[i]) {
                    count += x;
                    return count;
                } else {
                    count += arr[i];
                    coins -= (arr[i] * i);
                }
            }
        }
        return count;
    }
}


