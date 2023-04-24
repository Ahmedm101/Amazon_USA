
public class Methodpractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ProfitOfCompany();
		MonthlyProfitOfCompany ( "February" , 50000, 10000);
		
		int ProfitWithoutTax = MonthlyProfitofCompany ("March" , 30000, 10000);
		String month = "March";
		System.out.println( "profit of company" + month + "=" + ProfitWithoutTax );
		
		ProfitWithoutTax = MonthlyProfitofCompany ("April" , 60000, 7000);
		
		System.out.println( "profit of company" + "=" + ProfitWithoutTax );
		 
		
		 Methodpractise maliha = new Methodpractise ();
		 maliha. car ( "monday", 800, 100);
		
		
		
		
		
	}

	// no input no output --- method without argument 
	public static void ProfitOfCompany () {
		int income = 70000;
		int expense = 30000;
		int profit = income- expense;
		System.out.println( profit);
	}
	
	public static void MonthlyProfitOfCompany ( String month , int income,int expense) {
		int profit = income - expense;
		System.out.println("profit of company for"+ month +"="+ profit);
		
		
	}
	
	
	public static int MonthlyProfitofCompany (String month , int income,int expense) {
		
		int profit = income-expense;
		return profit;
		
	}
	
	public void car ( String day, int income, int expense) {
		int profit = income- expense;
				System.out.println( day + profit );
	
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
