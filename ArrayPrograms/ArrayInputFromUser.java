package ArrayPrograms;

import java.util.Scanner;

public class ArrayInputFromUser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[];                   //declaring array
        arr =new int[5];            //allocating memory to array
        int i;
        System.out.println("Enter Value in Array");
        for (i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Printing Values inside Array");

        for (i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }


    }



}
