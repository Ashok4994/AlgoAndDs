
public class IsPermutation {
	
	public static String sort(String w) {
		char[] a=w.toCharArray();
	    java.util.Arrays.sort(a);
	    //String s=a.toString();
	    //System.out.println(s);
	    //return s;
	     String s=new String(a);
	     System.out.println(s);
	     return s;
	}
	
 public static boolean permutation(String word1, String word2) {
	 return sort(word1).equals(sort(word2));
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] pairs={{"apple","paple"},{"ashok","kosha"},{"hello","lehho"}};
		for(String[] pair:pairs) {
		String word1= pair[0];
		String word2= pair[1];
		boolean ang=permutation(word1,word2);
		System.out.println(word1 + ", " + word2 + ": " + ang);
		}
		
	}

}
