package ArrayPrograms;

import java.util.Scanner;

public class OddEvenArray {
    public static void countOddEven(int[] arr) {

        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 == 0) // even
                ++evenCount;
            else                 // odd
                ++oddCount;
        }

        System.out.println("Count of the Even numbers = "
                + evenCount);
        System.out.println("Count of the Odd numbers = "
                + oddCount);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = scan.nextInt();

        int numbers[] = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; ++i) {
            numbers[i] = scan.nextInt();
        }

        countOddEven(numbers);

        scan.close();

    }


}
