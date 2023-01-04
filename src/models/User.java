package models;

public abstract class User {
	
	protected String name;
	protected int age;
	protected int userid;
	protected int salary;
	protected int workingHours;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public User(int salary, int workingHours) {
		this.salary = salary;
		this.workingHours = workingHours;
	}
	
	public abstract void PrintHours();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}


}
