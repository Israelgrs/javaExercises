package entities;
import java.util.Random;

public class Employee {
	public static int upperbound = 999;
	private int id;
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		this.salary = salary;
		this.name = name;
		this.id = generateId();
	}
	
	public Employee() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}
	
	public void increaseSalary(double percentage){
		this.salary += this.salary * percentage / 100.0;
	}
	
	private int generateId() {
		Random rand = new Random();

		return rand.nextInt(upperbound);
	}
	
	public String toString(){
		return this.id + "," + this.name + "," + this.salary;
	}
	
}
