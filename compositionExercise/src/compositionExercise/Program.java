package compositionExercise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Entities.Department;
import Entities.HourContract;
import Entities.Worker;
import Entities.enums.WorkerLevel;

public class Program {
	private static String dpName, workerName, level, cttDate, searchDate;
	private static Double baseSalary, cttValue;
	private static int qttContracts, cttDuration, searchMonth, searchYear;

	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the department's name: ");
		dpName = sc.nextLine();
		Department dp = new Department(dpName);
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		workerName = sc.nextLine();
		System.out.print("Level: ");
		level = sc.nextLine();
		System.out.print("Base Salary: ");
		baseSalary = sc.nextDouble();
		
		Worker wk = new Worker(workerName, WorkerLevel.valueOf(level), baseSalary, dp);
		
		System.out.print("How many contracts to this worker?");
		qttContracts = sc.nextInt();
		
		for(int i = 0; i < qttContracts; i++) {
			System.out.println("Enter contract #" + (i + 1) + " data:");
			sc.nextLine();
			System.out.print("Date(DD/MM/YYYY): ");
			cttDate = sc.nextLine();
			LocalDate parsedHour = LocalDate.parse(cttDate, fmt);
			System.out.print("Value per Hour: ");
			cttValue = sc.nextDouble();
			System.out.print("Duration (Hours): ");
			cttDuration = sc.nextInt();
			HourContract ctt = new HourContract(parsedHour, cttValue, cttDuration);
			wk.addContract(ctt);
			
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		searchDate = sc.next();
		String[] splittedDate = searchDate.split("/");
		searchMonth = Integer.parseInt(splittedDate[0]);
		searchYear = Integer.parseInt(splittedDate[1]);
		System.out.println("Name: " + wk.getName());
		System.out.println("Department: " + dp.getName());
		System.out.println("Income for: " + searchDate + ": " + String.format("%.2f", wk.income(searchYear, searchMonth)));
		
		sc.close();
	}
}
