package Entities;

import java.util.ArrayList;
import java.util.List;

import Entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	// Associations
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker(){		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
	public void addContract(HourContract contract){
		this.contracts.add(contract);
	}
	
	public void removeContract(HourContract contract){
		this.contracts.remove(contract);
	}
	
	public Double income(Integer year, Integer month){
		Double sum = baseSalary;
		
		for(HourContract c : contracts){
			if(c.getDate().getMonthValue() == month && c.getDate().getYear() == year){
				sum += c.totalValue();
			}
		}

		return sum;
	}
	

}
