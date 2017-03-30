import java.util.Hashtable;
import java.util.Scanner;

public class RomanToDecimalConversion {
	public static void main(String args[]) {
		
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		RomanToDec(str);
		
	}
	public static void RomanToDec(String s){
		Hashtable<Character,Integer> hm=new Hashtable<Character,Integer>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X',10);
		hm.put('L',50);
		hm.put('C',100);
		hm.put('D',500);
	    hm.put('M',1000);
	  
	    
	int size=s.length();
	int prev=0;
	for(int i=size-1;i>=0;i--) {
		int temp=hm.get(s.charAt(i));
		if(temp>=prev){
			
			prev+=temp;
		}else {
			prev-=temp;
		}
	}
	System.out.println("The roman value is "+prev);
	}

}
