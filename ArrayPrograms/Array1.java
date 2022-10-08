package ArrayPrograms;

public class Array1 {
    public static void main(String args[]){
        int x[] = new int[4];
        int i;
        x[0]=1;
        x[1]=2;
        x[2]=3;
        x[3]=4;

        System.out.println("Accessing Array position at 3 is :"+ " "+ x[3]);

        for(i=0;i< x.length;i++) {
            System.out.println("Printing Array in loop :"+ " "+x[i]);
        }

    }

}

