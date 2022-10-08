package ArrayPrograms;

public class ArrayofStrings {

    public static void main(String args[]){


        String a[] = new String[3];
        a = new String[]{"s","b","c","d","e"};


        String s[] ={"Sandeep", "Mandeep", "Mohan", "Rohan", "Mayank","Santosh"};

        int l= s.length;

        System.out.println("total String length of Array [s] is :"+ " "+l+a);

        System.out.println("Printing Values in Array of s:");
        for (int i=0;i<s.length;i++){

            System.out.println(s[i]);
        }


    }
}
