
public class IsUnique {
	
	
	
public static boolean isUniqChars(String str) {
	
	if(str.length()>128) {
		return false;
		
	}
	boolean[] char_set=new boolean[128];
	for(int i=0;i<str.length();i++) {
		int val=str.charAt(i);
		System.out.println(val);
		if(char_set[val]) return false;
	return true;
	}
	
	return true;
	
}
public static void main(String args[]) {
	String[] words={"ashok","akhil","aaaa","karthik"};
	for(String w:words){
		System.out.println(w +":"+isUniqChars(w));
	}
	}
}

