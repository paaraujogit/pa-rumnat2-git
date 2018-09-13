package pa.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	public BankAccount ba;
	
    @BeforeAll
    static void beforeAll() {
        System.out.println("Inicializações Globais");
    }
 
    @BeforeEach
    void beforeEach() {
        System.out.println("Inicialização do BankAccount");
        ba=new BankAccount(300,100,0);
    }

	@Test
	void testWithdraw() {
		int value=10;
    	double bal_ant=ba.getBalance();
    	ba.withdraw(value);
    	double bal_at=ba.getBalance();
    	System.out.println(ba.getBalance());
    	assertTrue(bal_at<bal_ant);
	}

	@Test
	void testDeposit() {
		double bal_ant=ba.getBalance();
    	ba.deposit(400);
    	double bal_at=ba.getBalance();
    	System.out.println(ba.getBalance());
    	assertTrue(bal_at>bal_ant);
	}

	@Test
	void testGetBalance() {
		//fail("Not yet implemented testGetBalance");
		
	}

}