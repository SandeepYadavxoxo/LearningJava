package LoopPrograms;

public class WhileLoopUsingBreak {

    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            System.out.println("Inside while loop");
            if (i ==6) {
                System.out.println("Inside if condition");
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Outside While loop");
    }



}
