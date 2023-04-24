package Try;

public class ClassC {

	int model;
	static int version;
	int model1=100;
	int version2;
	String Version = "one";
	int xray ;
	long Christmas;
	public static void main(String[] args) {
	
		
		/*ClassB loop = new ClassB("hi");
		loop.Login5();
		loop.Login1();
		ClassB.Login();
		ClassB.Login3(5000,2000);
		loop.Login();
		loop.Login30();*/
		
		ClassC ob = new ClassC();
		ob.model =10;
		version = 2022;
		ob.model1=110;
		ob.version2= 2023;
	System.out.println(ob.Version);
	ob.Version="TWO";
	System.out.println(ob.Version);
	ob.Global_test();
			ob.Global_test(100);
			
		System.out.println(ob.Christmas);	
		ob.Christmas = 600;
		System.out.println(ob.Christmas);
		ob.Global_test(800);
		
	}
	
	
   public void Global_test()    	{
	   model = 10;
	   version= 2022;	   
	   version2= 2024;
	   
	   String Version ="zero";
	   System.out.println(this.Version);
	   
	   
   }
    	
    	public void Global_test(int xray) {
    		System.out.println(this.xray);
    	}
    	
    }
	

