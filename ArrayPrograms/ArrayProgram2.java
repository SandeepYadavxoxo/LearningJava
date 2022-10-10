//copy elements of one array into the second array

package ArrayPrograms;
class ArrayClass  {
    public  int [] arrayValues (int [] arrayValues){
            return  arrayValues;
    }

    public void display (int [] array){

        for (int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}
public class ArrayProgram2 {

    public static void main(String[] args) {
        ArrayClass ac = new ArrayClass();
        int [] mainArray1 = {15,16,17,18,19,20};
        int [] mainArray2;
        mainArray2 = ac.arrayValues(mainArray1);
        System.out.println("Printing MainArray1 Values");
        ac.display(mainArray1);
        System.out.println("Printing MainArray2 Values");
        ac.display(mainArray2);

    }
}
