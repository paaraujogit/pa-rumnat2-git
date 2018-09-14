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
		this.app.execute("####### Exercício GIT Maven Jenkins Avançado");
		
		assertTrue( true );
	}
	
	@Test
	void testSomar() 
	{
		double result = this.app.somar( 10, 20 );
		
		assertEquals( 30, result );
		
		System.out.println( "####### Teste de soma realizado com sucesso." ); 
	}
	
	@Test
	void testSubtrair()
	{
		double result = this.app.subtrair( 50, 30 );
		
		assertEquals( 20, result );
		
		System.out.println( "####### Teste de subtração realizado com sucesso." ); 
	}
	
	@Test
	void testMultiplacacar()
	{
		double result = this.app.multiplicar( 5, 3 );
		
		assertEquals( 15, result );
		
		System.out.println( "####### Teste de multiplicação realizado com sucesso." ); 
	}
	
	@Test
	void testDividir()
	{
		double result = this.app.dividir( 100, 4 );
		
		assertEquals( 25, result );
		
		System.out.println( "####### Teste de subtração realizado com sucesso." ); 
	}
	
	@Test
	void testTruncar()
	{
		double result = this.app.truncar( 10.123456, 2 );
		
		assertEquals( 10.12, result );
		
		System.out.println( "####### Teste de truncar realizado com sucesso." ); 
	}
	
	@Test
	void testTruncar2()
	{
		double result = this.app.truncar( 100000000010.123456, 2 );
		
		assertEquals( 100000000010.12, result );
		
		System.out.println( "####### Teste de truncar2 realizado com sucesso." ); 
	}

	@BeforeAll
    static void beforeAll() 
	{
        System.out.println("####### Before all test methods");
    }
	
	@BeforeEach
	void beforeEach()
	{
		this.app = new App();
		System.out.println("####### Before Each test methods");
	}	
}
