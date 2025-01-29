
public class SelectionSort {

	
	public void selectionSort(int [] arr) {
		
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			
			int minindex=i;
			
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minindex]) {
					minindex=j;
					
				}
				
				int temp=arr[minindex];
				arr[minindex]=arr[i];
				arr[i]=temp;
			}
		}
	}
	
	
	public static void main(String[] args) {
       
		int [] arr= {65,78,23,12,98,13};
		
		SelectionSort b=new SelectionSort();
		b.selectionSort(arr);
		
		
		 System.out.println("Sorted array: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
		
		
	}
}
