import java.util.*;
public class Diagnoaldiff2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int N = Integer.parseInt(in.nextLine());
		long difference = 0;
		for(int i=0; i < N; i++) {
			String[] row = in.nextLine().split(" ");
			difference += (Integer.parseInt(row[i]) - Integer.parseInt(row[N - 1 - i]));
		}
		
		System.out.println(Math.abs(difference));
		
		in.close();
	}
}