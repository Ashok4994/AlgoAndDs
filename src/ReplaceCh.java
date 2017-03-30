import java.util.Scanner;

public class ReplaceCh {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//String s=sc.nextLine();
		//String str=s;
		String str="tat coa";
		System.out.println(isPermPalindrome(str));
	}
	
	public static boolean isPermPalindrome(String s) {
		int[] table=Common.buildFreqTable(s);
		return checkMaxOneOdd(table);
	}
	
	public static boolean checkMaxOneOdd(int[] table) {
		boolean foundOdd=false;
		for(int count:table) {
			if(count%2==1) {
				if(foundOdd)
					return false;
			}
			foundOdd=true;
		}
	return true;
}
}

 class Common {
	public static int[] buildFreqTable(String st) {
		int[] table =new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
		for(char c:st.toCharArray()) {
			int val=getCharacter(c);
			if(val!=-1) {
				table[val]++;
			}
		}
	return table;
	}
	public static int getCharacter(char c) 
	{
		int a=Character.getNumericValue('a');
		int b=Character.getNumericValue('b');
		int val=Character.getNumericValue(c);
		if(a<=val && val<=b) {
			val=val-a;	
			return val;
		}
		return -1;
	}
}
