
public class If_else_practise {

	public static void main(String[] args) {
		
		
		
		String address = "Arlington";
		
		if ( address == "Arlington" || address == "Maryland" && address != "New Jersey" || address == "New York") {
			System.out.println( " Arlington is not in Texas");
		}
		else { 
			System.out.println(" Arlington is in Texas ");
		}
		
		
		
		
	   String apple = "h";
	   if ((apple != "e" || apple == "d" || apple == "c") && (apple != "h" || apple =="2")) {
		   System.out.println("hello");
	   }
	   else { 
		   System.out.println("mello");
	   }
      
		
		int age1 = 6;
		int age2 = 24;
		
		if (age1> age2) {
			System.out.println("age 1 is greater than age 2");
		}
		else {
			System.out.println("age 1 is not greater than age 2 ");
		}
		
		int a = 5;
		int b = 10;
		
		if(a%b ==0) {
			System.out.println("the remainder is even");
		}
		else if (a%b!=0) {
			System.out.println("the remainder is odd");
		}
		else {
			System.out.println("the concept is not sucessful");
		}
		
		
		
		
		
		
		

	}

}
