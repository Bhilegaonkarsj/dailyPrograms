import java.util.Scanner;

public class Fibonasci {

	
	public static void main(String[] args) {
		
		
		Fibonasci f=new Fibonasci();
		
        System.out.print("Number ");

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		f.fibonasciii(n);
		
		sc.close();
		
	}
	
	
	
	public void fibonasciii(int n) {
		
        System.out.print("Fibonacci sequence: ");

		int a=0, b=1;
		for(int i=1;i<=n;i++) {
			
	        System.out.print(a+"");

			int nextterm=a+b;
			a=b;
		    b=nextterm;
		}
		
		
		
	}
}
