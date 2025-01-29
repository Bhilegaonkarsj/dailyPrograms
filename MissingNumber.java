import java.util.*;
import java.util.Scanner;

public class MissingNumber {

	
	public static void main(String [] args) {
		int total;
//		int [] arr= new int [] {1,2,3,5,6,7};
//		total=7;
		
		System.out.println("enter array::");
		List<Integer> l=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		
		String str=sc.nextLine();
		
		String [] arr=str.split(" ");
		
		for(String st:arr) {
			
			l.add(Integer.parseInt(st));
		}
		total=l.size()+1;
		
		System.out.println("size of array::"+total+  " "+ l.size());
		
		int exp_sum=total *(total+1)/2;
		int sum=0;
		
		for(int i:l) {
			sum+=i;
		}
		
		System.out.println("expected result for missing number::"+(exp_sum-sum));
		
		sc.close();
	}
}
