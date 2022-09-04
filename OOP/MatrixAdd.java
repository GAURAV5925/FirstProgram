package Expt;
import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n,m;

        System.out.println("Enter you rows and column");
        n=sc.nextInt();
        m= sc.nextInt();

        int a[][] = new int[10][10];
        int b[][] = new int[10][10];
        int c[][] = new int[10][10];

        for(int i = 0; i<n;i++){
            for(int j = 1 ; j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 1 ; j < m ; j++){
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your First Matrix");

        for(int i = 0; i<n;i++){
            for(int j = 1 ; j<m;j++){
                System.out.println(a[i][j]);
            }
        }
        System.out.println("Your Second Matrix");

        for(int i = 0; i<n; i++){
            for(int j = 1 ; j < m ; j++){
                System.out.println(b[i][j]);
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 1 ; j < m ; j++){
               c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Addition of matrix");

        for(int i = 0; i<n; i++){
            for(int j = 1 ; j < m ; j++){
                System.out.println(c[i][j]);
            }
        }


    }

}
