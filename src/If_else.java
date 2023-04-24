
public class If_else {

	public static void main(String[] args) {
		
		int apple = 5;
		if ( apple < 3) {
			System.out.println("the value of apple =" + apple);
		}
		else {
			System.out.println( "the value of apple is not =" +apple);
		}
		
		String milo = "dog name";
		if ( milo != " name") {
			System.out.println(" Milo's is a not a dog's name ");
		}
		else {
			System.out.println(" Milo is a dog's name");
		}
		
		int grade = 70;
		if (grade > 80 && grade <69) {
			System.out.println("Student grade is B ");
			
		}
		else {
			System.out.println( " Student grade is not B ");
		}
		
		
		// String password ="12345a"
		// if block: let customer login to website;
		//else: wrong password error message will be displayed;
		
		
		
	// remainder
		int mango = 10;
		int banana = 5;
		int remainder = mango% banana;
		if ( remainder < 4) {
			System.out.println("the remainder is even ");
		}
		else {
			System.out.println("the remainder is odd");
		}
	
	// remainder	
		int van = 10;
		if ( van% 3 ==0) {
			System.out.println("the remainder is odd");
		}
		else {
			System.out.println("the remiander is even ");
		}
		
		
		// password
		String password = "12345a";
		if ( password != "12345a") {
			System.out.println( " let customer login to website");
		}
		else {
			System.out.println( "wrong password error message will be displayed");
		}
		
		
		
		// baby Milo dinner 
		String dinner = "meal";
		//      true                   true                 false                false
		if ( dinner != "food" && dinner == "meal" || dinner == "Lunch" || dinner =="dog food") {
			System.out.println( "Milo main meal is dinner ");
			
		} 
		else if ( dinner == "food") {
			System.out.println("Milo eats food");
		}
		else {
			System.out.println("Milo main meal is lunch is incorrect ");
		}
			
		// write a program where letter is a vowel
		
		char letter = 'a';
		if ( letter == 'a'|| letter =='e'|| letter =='i'|| letter != 'a' || letter =='b') {
			System.out.println(" the letter " + 'a' + " is vowel");
		}
		else { System.out.println(" the letter is not a vowel");}
			
		
		String password1 = "abc123";
		
		
		if ( password1 == "Abc123") {
			System.out.println(" user should not be able to login");
			
		}
		else if ( password1!= "abc123") {
			System.out.println( "User should get a error message about forgot password");
		}
		else if ( password1 == "abc123") {
			System.out.println("User should be able to login ");
		}
		else { 
			System.out.println( " user should get a message to reset the password");
		}
		
		System.out.println(800);
		String password2 = "abc123!";
		String Username = "maliha08";
		
		if ( Username == "maliha08" ) {
			if ( password == "maliha8" || password2 =="abc12" ) {
				System.out.println(" user should not be able to login");
			}
			
			
			else if ( password2 == "abc123!" || password2=="abc1!" || password2 != "abc") {
				System.out.println("User should be able to login");
			}
			else {
				System.out.println( "error message");
			}
		}
		else { System.out.println("user should get a error message account cannot be found "); }
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
