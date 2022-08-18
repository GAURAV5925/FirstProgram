package Day7;

public class MethodOverload {
    void sum (int a, int b)
    {
        System.out.println("Sum is" + (a+b));

    }
    void sum(int a, int b,int c){
        System.out.println("sum is"+(a+b+c));
    }
    void sum(double a, double b){
        System.out.println("Sum is"+(a+b));
    }

    public static void main(String[] args) {
        MethodOverload cal = new MethodOverload();
        System.out.println("Method Overloading");
        cal.sum(8,5);
        cal.sum(5,5,5);
        cal.sum(4.6,3.8);
    }

}
