/*
 * Created on 07-Nov-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author hqy1
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
 
package pa.app;
 
public class BankAccount {
	double balance;
	double limit;
	double lowestBalance;
	
	public BankAccount(double b, double l, double lb){
		balance=b;
		limit=l;
		lowestBalance=lb;
	}
	
	//Withdraw money
	public void withdraw(double amount){
		//if(amount>limit)throw new IllegalArgumentException();
		//if(balance-amount<lowestBalance)throw new IllegalArgumentException();
		//if(amount<=0.00)throw new IllegalArgumentException();
		//else{
			balance=balance-amount;
		//}
	}
	
	//Deposit money
	public void deposit(double amount){
		//if(amount<=0.00)throw new IllegalArgumentException();
		balance=balance+amount;
	}
	
	//Get the value of balance
	public double getBalance(){
		return balance;
	}
	
	public static void main(String[] args) {
        System.out.println("Ola");
	BankAccount ba = new BankAccount(300,100,0);
    	System.out.println(ba.getBalance());
    	ba.withdraw(50);
    	System.out.println(ba.getBalance());
    	ba.deposit(100);
    	System.out.println(ba.getBalance());
    }
}
