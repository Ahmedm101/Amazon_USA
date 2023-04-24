package Try;

public class ClassB {
// only admin can acess? what do you mean we cannot see this class its public howcome?
	
	public static void main(String[] args) {
		
	ClassB loop = new ClassB(200);
	loop.Login5();
	loop.Login1();
	Login6();
	Login();
	Login3(5000,2000);
	
	//game (100000, 40000, "Pikachu");
	//int game1 = game (100000, 40000, "Pikachu");
	//System.out.println(game1);
	Login();
	Login30();
	Login3(5000,9000);
	Login6();	
		loop.Login5();
		Login6();
		
		 loop.game (3000,1000, "ki");
		
		 loop.Login5();
		
		Login30();
	
	}
    protected void Login5() {
    	int xray = 600;
    	while ( xray <610) {
    		//System.out.println("this is while loop for "+ xray );
    		xray++;
    		//600,601,602,603,604,605,606,607,608,609
    	
    	}
    System.out.println("maliha");
    	//Login30();
    //	Login6();
    	//Login1();
   
    }
    private static void Login6() {
    	//for (int scanner = 100; scanner>95; scanner--) {
    	//	System.out.println(" this is for loop for  " + scanner);}
    		
    	int income = 70000;
    	int expense = 50000;
    	int profit= income-expense;
    	String term= " this is Term 2 profit";
    	System.out.println(" this is static private Login6 " + profit);
    	//Login30();
    	//Login30();
    	}
    	

    
     public void Login1() {
    	System.out.println("ahmed");
    	 
     }
     
    public static void Login() {
    	 Login6();
    	 System.out.println(" this is static Login method of ClassB");
ClassB loop = new ClassB (200);
loop. game(100000, 40000, "Pikachu");
int game1= loop.game(100000, 40000, "Pikachu");
System.out.println(game1);

    	
    	
    }
    
    public static void Login3(int income, int expense) {
    	int profit =(income-expense);
    	System.out.println("this is Login 3 static method "+ profit);
    	//ClassB loop = new ClassB (200);
    	//loop.Login5();
    	//Login30();
    }
     
    
    
    
    private int game (int income, int expense, String pokemon_name) {
    	int profit = income- expense;
    	System.out.println(" this is the game profit for  " + pokemon_name  + " " + profit );
    	Login5();
    	Login3(7000,5000);
    	return profit;
    	
    	
    }
    
    
    
    
    
   public ClassB(int x) {
	   System.out.println("i am the user created constructor");
	  
	   
   }
    	  ClassB (String y) {
    		 System.out.println(" I am the string of ClassB");
    	 }
     
     static void Login30() {
    	 int x= 1000;
    	 System.out.println(x + "pom");
    	 Login3(50,70);
    	 Login6();
    	ClassB loop= new ClassB(200);
    	 loop.Login5();
    	
    	 
    	 
     }
     }