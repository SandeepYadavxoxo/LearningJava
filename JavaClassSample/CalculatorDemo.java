package JavaClassSample;

class CalculatorDemoClass{
    private int x,y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



    public int Addition(int x,int y){
        this.x=x;
        this.y=y;
        int sum;
        sum = x+y;
        return sum;
    }
    public int Multiply(int x,int y){
        this.x=x;
        this.y=y;
        int sum;
        sum = x*y;
        return sum;
    }

    public int Subtraction(int x,int y){
        this.x=x;
        this.y=y;
        int sum;
        sum = x-y;
        return sum;
    }
    public int Divide(int x,int y){
        this.x=x;
        this.y=y;
        int sum;
        sum = x/y;
        return sum;
    }


}


public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorDemoClass calculatorDemoClass = new CalculatorDemoClass();
        calculatorDemoClass.setX(5);
        calculatorDemoClass.setY(3);
       int p= calculatorDemoClass.getX();
       int q= calculatorDemoClass.getY();

       int resultAdd= calculatorDemoClass.Addition(p,q);
       int resultMul= calculatorDemoClass.Multiply(p,q);
       int resultSub= calculatorDemoClass.Subtraction(p,q);
       int resultDivide = calculatorDemoClass.Divide(p,q);

        System.out.println(resultAdd+" " +" "+resultMul+" "+resultSub+" "+resultDivide);


    }
}
