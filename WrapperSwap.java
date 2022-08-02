package BinarySearch;

public class WrapperSwap {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;

        swap(a, b);

        System.out.println(a + " " + b);

        final A gaurav = new A("Gaurav Jha");
        gaurav.name = "Other Name";

        A obj = new A("Random");

        System.out.println(obj);
    }
        static void swap(Integer a, Integer b){
            Integer temp = a;
            a = b;
            b = temp;
        }
    }
    class A{
        final int num = 10;
        String name;

        public A(String name){
            this.name = name;
        }


    }

