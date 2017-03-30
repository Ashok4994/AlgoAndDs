package search;
import java.util.*;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String args[]) {
		int[] a={1,2,3,4,9,6,5};
		System.out.println("Enter a value");
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		int mid,first=0,last;
		 last=a.length;
		int b=BinaryS(a,first,last,value);
		System.out.println("Found at"+b+1);
	}
	 public static int BinaryS(int[] a,int first,int last,int value) {
		 int mid= (first+last)/2;
		if(a[mid]==value) {
			return mid;
		}else if(a[mid]<value) {
			return BinaryS(a,first,mid-1,value);	 
	}else
		return BinaryS(a,mid+1,last,value);
}
}
