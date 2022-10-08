package ArrayPrograms;

public class ArrayofIntegers {
    public static void main(String args[]){
        int x[] = new int[4];
        int l;
        l=x.length;
        int i;
        x[0]=1;
        x[1]=2;
        x[2]=3;
        x[3]=4;

        System.out.println("length of array x is : "+" "+l);
        for(i=0;i< x.length;i++) {
            System.out.println("Printing Array in loop :"+ " "+x[i]);
        }

    }

}

