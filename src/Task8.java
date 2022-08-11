import java.util.*;
public class Task8 {
    //Mean
    public static double Mean(int array[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        double mean=(double) sum / (double) n;
        return mean;
    }
    //Median
    private static double Median(int arr[], int n) {

        Arrays.sort(arr);
        if (n % 2 != 0) {
            return (double) arr[n / 2];
        }

        return (double) (arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        System.out.println("Enter elements for array");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Mean of array is:" + Mean(array, size));
        System.out.println("Median of array is:" + Median(array, size));
    }
}