package ArrayPrograms;

import java.util.Arrays;

public class MergeTwoArray {

    public static void main(String[] args) {

        int src1[] = {1, 2, 3, 4, 5};
        int src2[] = {9, 8, 7, 6, 5};

        int newArray[] = new int[src1.length + src2.length];

        for(int i=0; i<src1.length; i++) {
            newArray[i] = src1[i];
        }

        for(int i=0, j=src1.length; j<(src1.length + src2.length);
            j++, i++) {
            newArray[j] = src2[i];
        }


        System.out.println("Array1 = " + Arrays.toString(src1));
        System.out.println("Array2 = " + Arrays.toString(src2));
        System.out.println("Merged Array = " + Arrays.toString(newArray));

        //Arrays.toString
        //Returns a string representation of the contents of the specified array.
        // The string representation consists of a list of the array’s elements,
        // enclosed in square brackets (“[]”).
        // Adjacent elements are separated by the characters “, ” (a comma followed by a space).
        // Returns “null” if a is null.

    }

}
