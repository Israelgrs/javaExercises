package arrayListExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {
	public static List<Employee> employees;

	public static void main(String[] args) {
		int qtdItems, increaseId;
		String nameField;
		double salaryField, percentIncrease;
		int currentItem = 0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		employees = new ArrayList<>();
		System.out.println("Input the quantity of employees to register");
		qtdItems = sc.nextInt();
		
		for(int i = 0; i < qtdItems; i++) {
			sc.nextLine();
			System.out.print("input the name of the " + (i + 1) + "º employee: ");
			nameField = sc.nextLine();
			System.out.print("input the salary of the " + (i + 1) + "º employee: ");
			salaryField = sc.nextDouble();
			employees.add(new Employee(nameField, salaryField));
		}
		
		for(Employee employee : employees) {
			currentItem += 1;
			System.out.println("Employee #" + currentItem);
			System.out.println("Id: " + employee.getId());
			System.out.println("Name: " + employee.getName());
			System.out.println("Salary: " + employee.getSalary());
			System.out.println("------------------");
		}
		
		sc.nextLine();
		System.out.print("Enter the Employee Id that will have the salary increase: ");
		increaseId = sc.nextInt();
		Employee emp = findEmployeeById(increaseId, employees);
		
		if(emp.getName() == null) {
			System.out.println("Employee not found!");
		}else{
			System.out.print("Enter the percent: ");
			percentIncrease = sc.nextDouble();
			emp.increaseSalary(percentIncrease);
		}
		
		System.out.println("List of Employees:");
		for(Employee employee : employees) {
			System.out.println(employee);
		}

		sc.close();
	}
	
	
	public static Employee findEmployeeById(int increaseId, List<Employee> employees){
		Employee ep = new Employee();
		for(Employee emp : employees) {
			if(emp.getId() == increaseId) {
				ep =  emp;
				break;
			}
		}
		
		return ep;
	}
}
