import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        System.out.println("Enter Your Subject Marks");
        Scanner sc = new Scanner(System.in);
        float total = 500;
        System.out.println("Enter Your Physics Marks :");
        int num = sc.nextInt();
        System.out.println("Enter Your Chemistry Marks");
        int num1 = sc.nextInt();
        System.out.println("Enter your Maths Marks");
        int num2 = sc.nextInt();
        System.out.println("Enter your Biology Marks");
        int num3 = sc.nextInt();
        System.out.println("Enter your English Marks : ");
        int num4 = sc.nextInt();


        float sum = num + num1 + num2+ num3 + num4;
        float percentage = (sum/total) * 100;
        System.out.println("Your Percentage is");
        System.out.println(percentage);
    }


}
