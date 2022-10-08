package ArrayPrograms;

public class ArrayofStrings {

    public static void main(String args[]){


        String s[] ={"Sandeep", "Mandeep", "Mohan", "Rohan", "Mayank","Santosh"};
        int l= s.length;
        System.out.println("total String length of Array [s] is :"+ " "+l);

        System.out.println("Printing Values in Array of s:");
        for (int i=0;i<s.length;i++){

            System.out.println(s[i]);
        }


    }
}
