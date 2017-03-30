import java.util.Scanner;

public class TriangleClassification {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the sides of triangle :");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a==b && b==c) {
		System.out.println("Triangle is equilateral");
	}
	else if ((a==b && b!=c) || ((b==c) && (c!=a)) || ((a==c) &&(c!=b))) {
		System.out.println("Isosceles triangle");
	}
	else
		System.out.println("Scalene Triangle");
}
}
