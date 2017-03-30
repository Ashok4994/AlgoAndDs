import java.util.Scanner;

public class StringCompression {
	public static void main(String args[]) {
		String str;
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		System.out.println("Old String :"+str);
		StringCompress(str);
	}
	public static void StringCompress(String str) {
		String s="";
		int countChar=0;
		for(int i=0;i<str.length();i++) {
			countChar++;
			if(i + 1 >= str.length()||str.charAt(i)!=str.charAt(i+1)){
				s+=""+str.charAt(i)+countChar;
				countChar=0;
			}
		}
		System.out.println("New String :"+s);
	}

}
