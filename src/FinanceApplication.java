import models.Employee;
import models.FinancialUser;

public class FinanceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		Employee b = new Employee("gerrit", 28);
		
	
		System.out.println(b.getName());
		
		FinancialUser a = new FinancialUser(4000,25);
//		a.setName("Gerrit");
//		a.setAge(29);
//		a.setSalary(800);
//		a.setUserid(2);
//		a.setWorkingHours(28);
//		a.PrintHours();
		System.out.println(a.getSalary());
		

	}

}
