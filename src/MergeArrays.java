

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,4,7,9,11,16,0,0,0,0};
		int[] b={2,5,8,18};
		merge(a,b,6,4);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
        System.out.println(a.toString());
	}

	public static void merge(int[] a,int[] b,int i,int j) {
		int k1=i+j-1;
		int i1=i-1;
		int j1=j-1;
		
		while(j1>=0) {
			if(a[i1]>b[j1]) {
				a[k1]=a[i1];
				i1--;
			}else {
				a[k1]=b[j1];
				j1--;
			}
			k1--;
		}
		
	}
}
