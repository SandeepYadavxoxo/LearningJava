package ArrayPrograms;

public class PassingArrayAsArgument {

    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
    }

    //Java language uses pass by reference not the pass by value
        static void Anotherdisplay(int arr1[]) {
        arr1[0]=51;
        arr1[4]=59;
            for (int i = 0; i < arr1.length; i++) {
                System.out.println(arr1[i]);
            }
        }

    public static void main(String[] args) {
        int array[] ={1,2,3,4,5};
        display(array);

        int array1[] ={6,7,8,9,10};

        Anotherdisplay(array1);

    }


}
