
public class Nested {

	public static void main(String[] args) {
		
    // username is maliha08 if true then login and ask for password, if false then show error message 
		
		/*String username = "maliha08";
	    if ( username == "maliha08") {
	    	if (username == "maliha") {
	    		System.out.println("entered valid username");}
	    		else if ( username != "maliha08") {
	    			System.out.println("entered in valid password");}
	    		else if (username == "malihab08") {
	    			System.out.println("sent email to reset the username"  );}
	    			else {
	    				System.out.println("username is correct");
	    			}}
	    	else if ( username == "maliha") {
	    		System.out.println("please enter valied username");}
	    		else {
	    			System.out.println( "enter your email address to sent the link for resetting username");}*/
	    		
	    			
	    		
	    		
	    	
	    
		
   /* String password = "A12345!";
    if ( password == "a12345!") {
    else if (password = "A2344");
    	System.out.println("invalid password"); }
    	
    }*/
	
	int age=21;
	if (age >18) {
		System.out.println("you are major");
	}
	else {
		System.out.println( "you are minor");
	}

	// customer can login with correct password only 
	
	String password = "Hello123!";
	String username = "Malihab";
	
	if ( username != "Maliha") {
	       if ( password != "Hello123!") {
	    	   System.out.println("incorrect password "); }
	       else if (password == "Hello123!") {
	    	   System.out.println(" customer can login");}
	       else {
	    	   System.out.println("reset username and password in order to login");
	    	   
	       }
	}
	else {System.out.println("account couldn't find with username and password");}
	
	
	
	// customer password requirement for making the account
	
	String password1= "abcd002!";
	String username2= "milo008";
	
	if (username2 !="abc3" || username2 =="abc2" && username2 != "milo") {
		if (password1 == "abc") {
			System.out.println("password needs to have 8 character");
		}
		else if (password1 == "Abc002") {
				System.out.println( "shouldn't have any capital letter");
		}
		else if (password1 == "abcd002!") {
			System.out.println("strong password met every requirement");
		}
		else {
			System.out.println("weak password need a special character" );
		}
		
	}
	else { System.out.println( "password need to meet all requirement to make an account");}
	
	
	System.out.println("nested");
	int a = 30;
	int b = 60;
	int c = 70;
	
	if ( a <50) {
		if ( a > b ) {
			System.out.println( "a is greater than b");
		}
		else if ( a <b || a< c ) {
			System.out.println( "a is less than b and c ");
		}
		else {
			System.out.println( "a is not less then b and c" );
		}
			
	} 
	else {
		System.out.println( "main condition is wrong" );
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}	
		
	}


