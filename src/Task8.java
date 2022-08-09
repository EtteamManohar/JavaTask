import java.util.*;
public class Task8 {
    public static double Mean(int array[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        double mean=(double) sum / (double) n;
        return mean;
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
    }
}