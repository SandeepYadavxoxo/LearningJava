package LoopPrograms;

public class DoWhileLoopUsingBreak {
    public static void main(String[] args) {
        int i=1;
            do {
                System.out.println(i);
                    i++;
                    if(i==5){
                        System.out.println("Inside if Statement");
                        break;
                    }
            }
            while (i<=10);
        System.out.println("Outside of loop");


    }

}
