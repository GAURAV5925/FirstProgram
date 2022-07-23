import java.util.Scanner;

public class integerornnot {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sc.hasNextInt());
    }
}
