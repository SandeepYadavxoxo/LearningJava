package LoopPrograms;

public class ContinueKeyWordDemo {

    public static void main(String[] args) {

        int i;
        for (i = 0; i <= 10; i++) {
            System.out.println("coming inside for loop");
            if (i == 3) {
                System.out.println("Success i equal to 3 ..");
                continue;
            }
            System.out.println(i);
            System.out.println("outside if statment but still inside for loop");
        }
        System.out.println("Outside loop");

    }



    // when a continue statement is encountered
    // the control directly jumps to the beginning of the loop
    // for the next iteration instead of executing
    // the statements of the current iteration
}
