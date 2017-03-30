
public class SparseSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={"abc"," "," "," ","banana","","","cat"};
		System.out.println(search(str,"cat"));
		}

	public static int search(String[] strings, String str) {
		if (strings == null || str == null || str.isEmpty()) {
			return -1;
		}
		return search(strings, str, 0, strings.length - 1);	
}
	public static int search(String[] st,String s,int first,int last) {
		int mid=(first+last)/2;
		if(st[mid].isEmpty()) {
			int left=mid-1;
			int right=mid+1;
			while(true) {
			if(left>=first && !st[left].isEmpty()) {
				mid=left;
				break;
			}else if (right<=last && !st[right].isEmpty()) {
				mid=right;
				break;
			}
			right++;
			left--;
			
		}
		
	}
		
		if(s.equals(st[mid])){
			return mid;
		}else if(st[mid].compareTo(s)<0) 
			return search(st,s,mid+1,last);
	 else {
		return search(st,s,first,mid-1);
}
}
}

