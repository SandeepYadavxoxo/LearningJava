//Program description:-
// Develop a Java program array of double data-type.
// Pass this array to a method
// to calculate the sum of the array elements.
// Also, pass this array to a method to display the array elements
// and later display the sum of the array elements.

package ArrayPrograms;

public class Problem1ArrayInputFromUser {

    public static void display(double[] doubleArray){

        for (int i =0;i<doubleArray.length;i++){
            System.out.println(doubleArray[i]);
        }
    }

    public static double sum(double arrayElements[])
    {   double sum =0.0;

        for(int i=0;i<arrayElements.length;i++) {
            sum = sum + arrayElements[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        double mainArray[] ={1.1,1.2,1.5};
        double sumofArray;

        sumofArray= sum(mainArray);
        display(mainArray);
        System.out.println(sumofArray);

    }
}
