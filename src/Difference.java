/*7.	Given N and K, where N is the number of the integers and K   is the difference. You are supposed to find out how many pairs of numbers are of the difference K. */
import java.lang.*;
public class Difference {
	public static void main(String args[]) {
	 int count=0;
	//int[] a={1,2,3,4,5,6,7};
	int[] a={7,2,6,3,5,1,4};
     
	for(int i=0;i<a.length;i++){
		for(int j=1;j<a.length;j++) {
			if(a[i]-a[j]==2) {
				System.out.println("The pair is "+a[j]+" " +a[i]);
				count++;
			}
		}
	}
	System.out.println("The count is"+count);
	
}

}


