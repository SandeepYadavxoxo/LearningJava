package ArrayListPrograms;

import java.util.ArrayList;

public class ArrayListAddingElement {

    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>();

        str.add("Sandeep");
        str.add("Mandeep");
        str.add("Satish");

        //methods of Arraylist add(int index, Object element)
        // This method is used to insert a specific element at a specific position index in a list.

        //adding object element Santosh in index no 1
        str .add(1,"Santosh");

        //add(Object o)	This method is used to append a specific element to the end of a list.
        str.add("Vinay");

        ArrayList<String> str2 = new ArrayList<>();

        str2.add("Jay Hardway");
        str2.add("Abel Tesfaye");

        //addAll(int index, Collection C)
        //Used to insert all of the elements starting at the specified position
        // from a specific collection into the mentioned list.

        str.addAll(2,str2);

        //There are Many more methods
        //https://www.geeksforgeeks.org/arraylist-in-java/?ref=gcse

        System.out.println(str);

    }
}
