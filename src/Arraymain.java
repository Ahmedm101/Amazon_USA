
public class Arraymain {

	public static void main(String[] args) {
		
		
		// create 3 array box and print from 3rd index to 1st 
		
		char tesla [] = new char [3];
				tesla [0] = 'x';
		tesla [1] ='y';
		tesla [2] ='z';
		
		for ( int a = (tesla.length -1); a >= 0 ; a--) {
			System.out.println( tesla [a]);
		}
		
		System.out.println("for loop");
		for (int b = 0; b< 3; b++) {
			System.out.println(tesla [b]);
		}
		
		// java is making a box datatype integar the box name is b assigning the value 0
		// condition is there which is b < 3 which is true, going to the body jvm is putting the value 0 in B which means we are 
		// directing JVM to print tesla[0]. x, then jvm is reading b++ increasing the attached variable by 1 the new value is 1
		// justifying the condition again 1 is < 3 its true then printing the value of tesla[3]
		
		System.out.println(" for each loop");
		
		for ( int c: tesla) {
			System.out.println(c);
		}
		
		int car []= { 5, 10, 22, 24, 25};
	System.out.println("for loop");	
		for ( int a = 4; a >=0; a--) {
			System.out.println( car[a]);
		}
		
		
		System.out.println("for each loop");
		for ( int b: car) {
			System.out.println(b);
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
