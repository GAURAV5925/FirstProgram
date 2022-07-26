package Methods;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 505;
        arr[2] = 203;
        arr[3] = 105;
        arr[4] = 507;

        System.out.println(arr[3]);

        for(int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        String[] str = new String[4];

        for(int i =0; i<str.length; i++){
            str[i] = in.next();
        }



        str[1] = "Gaurav";

        System.out.println(Arrays.toString(str));
    }

}
