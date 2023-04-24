
public class ClassA {

	public static void main(String[] args) {
		ClassA ob = new ClassA();
		ob.Car();
		ob.Jeep();
		ob.Car();	
		
		
		
		
	}

	public void Car() {
		System.out.println("I am non static method of Class A");
	}
	
	public ClassA() {
		System.out.println("I am Constructor of Class A");
	}
	public static void Car1() {
		System.out.println("I am static Car1 method");
	}
	public void Jeep() {
		System.out.println("I am non static Jeep method");
	}
	public ClassA(int z) {
		System.out.println("I am constructor of Class A with parameters");
		// when we make new constructor with parameter we are making new objects too? 
		//we are also being able to call any method using all the different objects
		// we know for constructor its two type one without arg which can be made once, one with arg and with arg is it changeable variable
		// for same datatype?
		// so what do you mean by when you say we have to make class if we make mutiple constructor? here we are making multiple constructor
		// with arg like method without making new classes.
		//when we make our own constructor default is deleted so when we make another new constructor the first our own one doesn't get deleted?
				// and onwards we make different constructor so when to know which constructor to be used?
		//cnstructor can be protected, private like method?
	}
	 public ClassA( String x) {
		System.out.println("I am truck");
		
		
	}
} 



