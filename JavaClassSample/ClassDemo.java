package JavaClassSample;

class Sum {

    public int display(int x, int y){
        int sum;
        sum = x+y;
        return sum;
    }
}
public class ClassDemo {

    public static void main(String[] args) {
        Sum s = new Sum();
        int result;
       result= s.display(6,19);
        System.out.println(result);

//        int a = 5;
//        int b = 7;
//        int sum = 0;
//        sum = a + b;
//        System.out.println("a+b"+" " + sum);

    }


}
