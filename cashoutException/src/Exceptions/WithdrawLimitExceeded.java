package Exceptions;

public class WithdrawLimitExceeded extends Exception {
	private static final long serialVersionUID = 1L;
	
	public WithdrawLimitExceeded(String msg){
		super(msg);
	}
}
