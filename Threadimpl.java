
public class Threadimpl{
	
	public static void main(String [] args) {
		Mythread t=new Mythread();
		
	     System.out.println("thread state:::"+t.getState());

		t.start();
		
	     System.out.println("thread state:::"+t.getState());

//     System.out.println("inside extended class");
	}

}
