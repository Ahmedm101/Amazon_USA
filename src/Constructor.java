
public class Constructor {

	public static void main(String[] args) {
		
		
		
		Constructor ob = new Constructor ();
		
		ob.sum();
		int sum3 = ob.sum2(200);
		
	 Constructor ob1= new Constructor ("hello");
	 ob1.sum();
		
		
		
		
		

	}

	public Constructor () {
		System.out.println("my name is constructor");
	}
	
	public void sum () {
		int dec = 12;
		int feb = 6;
		int total = dec -feb ;
		System.out.println(total);
	}
	
// how can we call static method in non static method under the constructor
	public static void sum ( String month, int dec, int feb) {
		int total = dec - feb;
		System.out.println(total + month );
	}
	
	public int sum2 (int dec) {
	
		
		return dec;
	}
	
	
	
		
	
	
	
	public static void starwars () {
		System.out.println("i am starwars");
	}
	
	
	// as we use non static as staitc takes a lot of memory so we make non static method and call them in method by making object ? 
	// do we make static method and call them in the main method by making object i mean we can static in non static method by making object
	// we always call in the main method, we cannot call them in the method as JVM only reads main method
	// we cannot make method inside a method
	// method name needs to be change?
	
	public Constructor(String y) {
		System.out.println("little you know");
		
	}
	
	
		// so here we are being able to change the value of the variable same like method ?
		//of course different datatype we need to make different constructor so we need to make object for each constructor made?
		// 
		
	
	

	
	
	
	
	
	
	
}
	

