import java.io.*;
import java.util.*;

public class DiagonalsDifference {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int[][] a=new int[5][5];
        Scanner sc=new Scanner(System.in);
        int i,j,sum1=0,sum2=0;
        System.out.println("enter index value");
        int n=sc.nextInt();
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++) {
            for(j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                System.out.print(a[i][j]);
            }
            System.out.println("\n");
        }
        for(i=0,j=n-1;i<n;i++,j--) {
            sum1+=a[i][i];
            sum2+=a[i][j];
        }
        System.out.println("Sum1 is :"+sum1);
        System.out.println("Sum2 :"+sum2);
        System.out.println("Difference="+Math.abs(sum1-sum2));
    }
}