
public class Array {

	public static void main(String[] args) {
	
		// array
		
		// value of the first box is 100
		int fruits [] = new int [10];
				fruits [0]= 100;
				fruits [2]= 50;
				fruits [3]= 70;
				
				System.out.println(" the value of first box =" + fruits[0]);
				System.out.println(fruits[2]);
				System.out.println(fruits [9]);
				System.out.println(fruits.length);
				
		int dog [] = new int [20];
		dog [0] = 40;
		dog [1] = 80;
		dog [2] = 60;
		dog [4] = 100;
		
		System.out.println( dog [4] - dog [1]);
		System.out.println(dog [4 ]* dog[18]);
		System.out.println( dog [4]/ dog[2]);
		
		
		
		
		
		
		// try in string
		
		String login [] = new String [5];
		 login [0] = "200";
		 login [1] = "Evan";
		 login [2] = "50";
		 
		 System.out.println(login[4]);
		 System.out.println(login[2]+ login[1]);
		 System.out.println(login[3]+ login[0]);
		 System.out.println(login.length);
		 
		 //tey in char 
		 System.out.println("char");
		 
		 char flu []= new char [6];
		  flu [0] ='2';
		  flu [1] = '2';
		  flu [2] = '6';
		  
		  System.out.println(flu [0]);
		  System.out.println(flu.length);
		  
		  
		  // try in long
		  
		  long fly [] = new long [8];
		   fly[0] = 100;
		   fly [1]= -10;
		   fly [2] = 80;
		   fly [4] = 50;
		   System.out.println("hi");
		   
		  
		   System.out.println(fly[0] % fly[2]);
		   System.out.println(fly.length);
		   
		// print the value for all index with for loop
		   
		   int house [] = new int [10];
		   house [1]= 40;
		   house [4] = 70;
		   
		   System.out.println(house [2]);
		   System.out.println(house[4]);
		   System.out.println(house.length);
		   
		   for ( int home= 0; home < house.length; home++ ) {
			   System.out.println( house [home]);
		  
		  
		   System.out.println("ki koro");
		   
		   int homy = 0;
		   do {System.out.println(house [homy]);
		   homy++;
		   }
		   
		  while (homy< house.length); 
		
		   System.out.println("fefe");  
		   int come =4;
		   while ( come > house[0]){
			   System.out.println( house [come]);
			   come--; }
		   {                                        
			   
			   
			String add [] = new String [4];
			add [0] = "how";
			add[1] = "why";
			add[3] = "ok";
			
			for ( String k: add) {
				System.out.println(k);
			}
			
			
			// create a array of 5 length
			
			/*String boo [] = new String [5];
			zoo [0] = "zebra";
			zoo [1] = "giraffe";
			zoo [3] = "cat";
			 
			for (int a = 0; a < zoo.length; a++) {
				System.out.println("the value of index =" + a);
			}
			    */
			   
			int zoo [] = new int [5];
			zoo [1] = 200;
			zoo [3] = 300;
			
			/*for ( int x = 0; x < zoo.length; x ++) {
				System.out.println( zoo [x]);
			}
			System.out.println(zoo.length);*/
			   
			for (int x = 0; x < 2; x++) {
				System.out.println(zoo[x]);
			}
			   
			   
			   int s= 5;
			   int b= s++;
			   System.out.println(s);
			   System.out.println(b);
			   
			   
		   }
	}
		   
	}
}
		 
		
		   
				
		  
	
				
		
		
	


