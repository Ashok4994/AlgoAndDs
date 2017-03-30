import java.util.LinkedHashMap;

public class LongSubStringWithoutRep {
public static void main(String args[]) {
	longestSubString("javaconceptoftheday");
}
public static void longestSubString(String s) {
	char[] ch=s.toCharArray();
	int len=0;
	String longestSubString="";
	LinkedHashMap<Character,Integer> lm=new LinkedHashMap<Character,Integer>();
	for(int i=0;i<ch.length;i++) {
		char c=ch[i];
		if(!lm.containsKey(c)) {
			lm.put(c, i);
		
		}else {
			i=lm.get(c);
			lm.clear();
		}
		longestSubString=lm.keySet.toString();
		if(lm.size()>len) {
			len=lm.size();
			//longestSubString=lm.keySet.toString();
		} 
	}
	  System.out.println("Input String : "+s);
      
      //System.out.println("The longest substring : "+longestSubString);
       
      System.out.println("The longest Substring Length : "+len);
}

}
