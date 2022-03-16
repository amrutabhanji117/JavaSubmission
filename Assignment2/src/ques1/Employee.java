package ques1;

import java.util.Scanner;

public class Employee {

	public Employee() {
		
		this.id = 0;
		this.firstName = null;
		this.lastName = null;
		this.salary = 0;
	}

	int id;
	String firstName;
	String lastName;
	int salary;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=new Employee();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the id:");
		e.setId(s.nextInt());
		System.out.println("Enter the first name:");
		e.setFirstName(s.next());
		System.out.println("Enter the last name:");
		e.setLastName(s.next());
		System.out.println("Enter the salary:");
		e.setSalary(s.nextInt());
		
		System.out.println("Name:"+e.getFirstName() +" "+ e.getLastName());
		System.out.println("AnnualSalary :"+e.getSalary()*12);
		System.out.println("raised salary:"+e.raiseSalary(2));
		String Employee=e.toString();
		System.out.println(Employee);
	
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int raiseSalary(int percent)
	{
		int newsalary=(percent*salary)/100;
		newsalary=newsalary+salary;
		return newsalary;
	}

	public String toString()
	{
		return "Employee[id="+getId()+",name= "+getFirstName()+" "+getLastName()+",salary= "+getSalary()+"]";
	}
}
