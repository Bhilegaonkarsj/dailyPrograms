
public class InsertionSort {

	
	
	public static void main(String[] args) {
		
		
		
		int[] arr = {12, 11, 13, 5, 6};
		
		InsertionSort i=new InsertionSort();
	    i.insertionSort(arr);
	    System.out.println("Sorted array: ");
	    for (int num : arr) {
	        System.out.print(num + " ");
	    }
		
	}
	
	
	public void insertionSort(int [] arr) {
		
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key) {
				
				arr[j+1]=arr[j];
				j=j-1;
			}
			
			arr[j+1]=key;
		}
	}
	
	
}
