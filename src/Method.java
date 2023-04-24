
public class Method {

	public static void main(String[] args) {
		
		TotalStudentGrade("Exam1", 70, 80);
		TotalStudentGrade("Exam2",  50, 90);
		int finalexam = StudentGradeObtained( "final exam" ,80, 20);
		System.out.println("total grade obtained for " + finalexam);
		
		int midtermexam=StudentGradeObtained();
		System.out.println("total grade obtained for "   + midtermexam);
		
	}
	
	
	public void StudentGrade() {
		
		
		int math= 50;
		int computer = 60;
		int sum =(math+computer);
		int avg = sum/3;
		System.out.println("total grade obtained =" + avg);
		
	}
	// this one if needs to be change variable and variable value needs to be changeable
	public static void TotalStudentGrade(String Exam,int math, int computer) {
		
		int sum =(math+computer);
		int avg =(sum/3);
		System.out.println("total grade obtained for " + Exam +" " +  avg);
	}
	
	// why are we doing return type here?
	public static int StudentGradeObtained(String Exam,int math, int computer) {
		int sum =(math+computer);
		int avg =(sum/3);
	
		return avg;
		
		
	}
	// why we put new numbers here and why are we doing this ?
	// how to give a space after exam 2 and 46 ??
	// for each method are we using different numbers?
	//why do syso in main method not in the method
	
	public static  int StudentGradeObtained() {
		int math = 100;
		int computer =90;
		int sum =(math+computer);
		int avg =(sum/2);
		
		
		return avg;
	}
	

}
