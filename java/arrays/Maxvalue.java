import java.util.Scanner;

//taking the input of an array from the user and returning the maz vakye present in it

public class Maxvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int maxValue = findMaxValue(array);
        System.out.println("The maximum value in the array is: " + maxValue);
    }

    public static int findMaxValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}