package Entities;

import Exceptions.WithdrawLimitExceeded;
import Exceptions.NotEnoughBalance;

public class Account {
	private Integer number;
	private String holder;
	private double balance;
	private Double withdrawLimit;
	
	public Account(){
	}
	
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double inicialBalance) {
		this.balance = inicialBalance;
	}
	public Double getWithdraw() {
		return withdrawLimit;
	}
	public void setWithdraw(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void withdraw(double withdrawValue) throws WithdrawLimitExceeded, NotEnoughBalance{
		if(withdrawValue > withdrawLimit) {
			throw new WithdrawLimitExceeded("The amount exceeds withdraw limit");
		}
		if(withdrawValue > getBalance()){
			throw new NotEnoughBalance("Insuficient balance");
		}
		
		this.balance -= withdrawValue;
	}
	
	
}
