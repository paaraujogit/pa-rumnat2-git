package pa.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
	private App app;
	
	@Test
	void testExecute() 
	{
		this.app.execute("####### Exercício GIT Maven Jenkins");
	}

	@BeforeAll
    static void beforeAll() 
	{
        System.out.println("Before all test methods");
    }
	
	@BeforeEach
	void beforeEach()
	{
		this.app = new App();
	}	
}
