package sortings;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String args[]) {
		int[] a={4,7,9,3,5,2,1};
		int i,j,temp;
		int n=a.length;
		for(i=0;i<=n-1;i++) {
			for(j=1;j<=n-1;j++) {
				if(a[j-1]>a[j]) {
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
			System.out.println("At iteration"+(i+1)+Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));
	}

}
