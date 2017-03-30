import java.util.HashMap;
import java.util.Scanner;

public class RepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		firstRepeatedNonRepeated(str);

	}
	static void firstRepeatedNonRepeated(String s) {
		
		HashMap<Character,Integer> ch=new HashMap<Character,Integer>();
		char[] carray=s.toCharArray();
		for(char c:carray){
			if(ch.containsKey(c)) {
				ch.put(c, ch.get(c)+1);
			}
			else {
				ch.put(c, 1);
			}
			
		}
		for(char c:carray) {
		if(ch.get(c)==1) {
			System.out.println("First non repeated character:"+c);
			break;
		} 
		}
		for(char c:carray) {
			if(ch.get(c)>1) {
				System.out.println("First repeated character:"+c);
			break;
			}
		}
		
	}

}
