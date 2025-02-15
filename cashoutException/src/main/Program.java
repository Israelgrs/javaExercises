package main;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import Exceptions.WithdrawLimitExceeded;
import Exceptions.NotEnoughBalance;

public class Program {
	private static int number;
	private static String holder;
	private static double initialBalance, withdrawLimit, withdrawValue;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account data");
		System.out.print("Number: ");
		number = sc.nextInt();
		sc.nextLine();;
		System.out.print("Holder: ");
		holder = sc.nextLine();
		System.out.print("Initial Balance: ");
		withdrawLimit = sc.nextDouble();
		System.out.print("Withdraw Limit: ");
		withdrawLimit = sc.nextDouble();
		Account acc = new Account(number, holder, initialBalance, withdrawLimit);
		

		sc.nextLine();
		System.out.print("Enter amount for withdraw: ");
		withdrawValue = sc.nextDouble();
		try {			
			acc.withdraw(withdrawValue);
		} catch(WithdrawLimitExceeded e) {
			System.out.println("Withdraw error: " + e.getMessage());
			return;
		} catch (NotEnoughBalance e) {
			System.out.println("Withdraw error: " + e.getMessage());
			return;
		}

		System.out.print("New balance: " + acc.getBalance());
	}

}
