public class SumOfArrays {
    public static void main(String[] args) {
        // Sample array
        int[] array = {1, 2, 3, 4, 5};
        
        // Call the sumArray method to calculate the sum
        int sum = sumArray(array);
        
        // Print the sum
        System.out.println("Sum of array elements: " + sum);
    }
    
    // Method to calculate the sum of elements in the array
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
