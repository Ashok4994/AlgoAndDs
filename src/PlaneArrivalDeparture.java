/*1.	Given two arrays, one containing the departure times of planes and the other the arrival times, find the minimum number of gates needed to be open at a time for the airport so that no plane waits. */
public class PlaneArrivalDeparture {
	public static void main(String args[]){
		int[] arrival={900,940,950,1100,1500,1800};
		int[] departure={910,1200,1120,1130,1900,2000};
		java.util.Arrays.sort(arrival);
		java.util.Arrays.sort(departure);
		int a=arrival.length;
		System.out.println("Number of platforms required: "+NoOfPlatforms(arrival,departure,a));
		
	}
	public static int NoOfPlatforms(int[] arrival,int[] dept,int size) {
		
		int i=1,j=0;
		int num=1,result=0;
		while(i<=size-1 && j<=size-1) {
			if(arrival[i]<dept[j]){
				num++;
				System.out.println(num);
				i++;
				if(result<num) {
					result=num;
				}
			}
			else {
				num--;
				System.out.println(num);
				j++;
			}
			
		}
		return result;
		
	}

}
