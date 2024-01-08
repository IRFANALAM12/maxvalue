import java.*;
        public class maxValue {
            public static int maxValue(int arr[], int n, int idx) {
                if (idx == n - 1) {
                    return arr[n - 1];
                }
                int maxOfLaterIndices = maxValue(arr, n, idx + 1);
                int maxValue = Math.max(arr[idx], maxOfLaterIndices);
                return maxValue;
            }
        
            public static void main(String[] args) {
                int[] arr = { 13, 1, -3, 22, 5 };
                int n = arr.length;
                System.out.println("The max value is: " + maxValue(arr, n, 0));
            }
    }

