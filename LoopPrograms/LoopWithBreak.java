package LoopPrograms;

public class LoopWithBreak {
    public static void main(String[] args) {

        int i;
        for (i = 0; i <= 10; i++) {
            System.out.println("coming inside for loop");
            if (i == 3) {
                System.out.println("Success i equal to 3..");
                return;
            }
            System.out.println(i);
            System.out.println("outside if statment but still inside for loop");
        }
        System.out.println("Outside loop");

    }

}
