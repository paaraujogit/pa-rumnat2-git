package pa.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class BankAccountTestJU5 {
	public BankAccount ba;
	
    @BeforeAll
    static void beforeAll() {
        System.out.println("Inicializa��es Globais");
    }
 
    @BeforeEach
    void beforeEach() {
        System.out.println("Inicializa��o do BankAccount");
        ba=new BankAccount(300,100,0);
    }

	@Test
	void testWithdraw() {
		int value=10;
    	double ba_ant=ba.getBalance();
    	ba.withdraw(value);
    	System.out.println(ba.getBalance());
    	assertTrue(ba.getBalance()<ba_ant);
	}

	@Test
	void testDeposit() {
		double bal_ant=ba.getBalance();
    	ba.deposit(1000);
    	double bal_new=ba.getBalance();
    	System.out.println(ba.getBalance());
    	assertTrue(bal_new>bal_ant);
	}
	@Disabled
	@Test
	void testGetBalance() {
		//fail("Not yet implemented testGetBalance");
	}

}