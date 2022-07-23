import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class name {
    public static void main(String[] args) {
        System.out.println("Enter the Distance in Km: ");
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        float total = km * 1.60f;
        System.out.println("Your Distance in miles are : ");
        System.out.println(total);
    }
}
