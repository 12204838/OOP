package models;
public class Employee extends User{



	public Employee(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void PrintHours() {
		// TODO Auto-generated method stub
		System.out.println("The workingHours of this Employee is" + getWorkingHours());
	}

	
}
