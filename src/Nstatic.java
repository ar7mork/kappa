
public class Nstatic {
	private static int myCounter;
	
	private int myIntegerField;
	
	public void display() {
		System.out.println("My object: "+ myIntegerField);
		System.out.println("My static counter: " + myCounter);
	}
	
	public Nstatic(){
		myIntegerField =0;
		
		++myCounter;
		
		}
	public Nstatic(int InpValue){
		myIntegerField = InpValue;
		
		++myCounter;
		}
	}	
