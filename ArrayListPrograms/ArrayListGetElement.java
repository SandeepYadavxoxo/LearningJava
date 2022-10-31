package ArrayListPrograms;

import java.util.ArrayList;

public class ArrayListGetElement {

    public static void main(String[] args) {
        ArrayList<Integer> listOfInteger = new ArrayList<>();

        //adding data in ArrayList listOfInteger

        listOfInteger.add(51);
        listOfInteger.add(64);

        //adding 65 at the index no 3
        listOfInteger.add(2,65);
        listOfInteger.add(21);

        //get() method is used to fetch the element from Array
        System.out.println("Printing Value at index 2 from Array List");
        System.out.println(listOfInteger.get(2));

        //printing all the data in the ArrayList we need to use loop

        System.out.println("Printing All the Data in Array List");

        for(int i=0; i<listOfInteger.size();i++)
        {
            System.out.println(listOfInteger.get(i));

        }


    }






}
