package LoopPrograms;

public class LoopWithBreak {
    public static void main(String[] args) {

        int i;
        for (i = 0; i <= 10; i++) {

            if (i == 5) {
                System.out.println("Breaking loop");
                break;
            }
            System.out.println(i);
        }
        System.out.println("Outside for loop");

    }

}
