package sortings;

public class MergeSort {

	private int[] array;
	private int[] tempArray;
	private int length;
	
	
	public static void main(String[] args){
		int[] inparray={5,9,6,3,8,2,1,7};
		MergeSort ms=new MergeSort();
		ms.sort(inparray);
	
	}
	
	public static void sort(int input_array[]) {
		this.array=input_array;
		this.length=input_array.length;
		this.tempArray=new int[length];
		mergeSort(0,length-1);
		
	}
	public void mergeSort(int lowerIndex,int higherIndex) {
		if(lowerIndex<higherIndex) {
			int mid=lowerIndex+(higherIndex-lowerIndex)/2;
			 mergeSort(lowerIndex,mid);
			 mergeSort(mid+1,higherIndex);
			 mergeParts(lowerIndex,mid,higherIndex);
		}
	}
	public void mergeParts(int lowerIndex,int mid,int higherIndex) {
		int i,j,k;
		i=lowerIndex;
		j=mid+1;
		k=higherIndex;
		int b=0;
		while(i<=mid &&j<=k) {
			
			if(array[i]<array[j]) {
				tempArray[b]=array[i];
				i++;
			}else {
				tempArray[b]=array[j];
				j++;
			}
			b++;
		}
	}
	
	}

