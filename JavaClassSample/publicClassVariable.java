package JavaClassSample;

class sub{
    int a,b;
    public int subOp()
    {
        int subResult= a-b;
        return subResult;
    }
}
public class publicClassVariable {
    public static void main(String[] args) {
        sub s= new sub();
        s.a=75;
        s.b=43;
       int result= s.subOp();
        System.out.println(result);


    }
}
