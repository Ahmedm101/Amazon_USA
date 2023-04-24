import javax.swing.plaf.synth.SynthOptionPaneUI;

public class For_loop {

	public static void main(String[] args) {
	
		// for loop
		
		for (int apple = 1; apple <5; apple++) {
			System.out.println(apple);
		}
		
		System.out.println("task 1");
		
		// print 1000 to 500
		for (int car = 1000; car >= 500; --car) {
			System.out.println(car);
		}
		
		
		int xx=99;
		do {System.out.println(xx);
		xx++;
		}
		while(xx>100);
		
		int yy =90;
		while(yy<90) {
			System.out.println(yy);
			yy++;
			
		}
		
		
		
		// print -100 to -80
		
		System.out.println("task 2");
		for ( byte printer = -100; printer<= -80; printer++) {
			System.out.println(printer + "is good");
			
		}
		
		// print 5000 to 5500;
		System.out.println("long task");
		
		for (long nails = 5000; nails < 5500; nails++) { 
			System.out.println( "long" + nails);
		}
		
		// print 777.777 - 999.999
		System.out.println("Double task");
		
		for ( float deck = 777.777f ; deck <= 999.999; deck++) {
			System.out.println(deck);
		}
		
		System.out.println("char");
		//print 5 to 10
		for ( char apple = 'a'; apple< 'f'; apple++ ) {
			System.out.println(apple);
		}
		System.out.println("char number 1");
		// print 7 to 5
		for (char hen = '7'; hen> '5'; hen--) {
			System.out.println("total hen =" + hen);
		}
	}
		
	
		
}



	


