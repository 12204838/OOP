package models;
public class FinancialUser extends User{

	public FinancialUser(int salary, int workingHours) {
		super(salary, workingHours);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void PrintHours() {
		// TODO Auto-generated method stub
		System.out.println("The workingHours of this Financial user is " + getWorkingHours());
		
	}

}
