package pa.app;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    private App app;
    
    public AppTest( String testName )
    {
        super( testName );
        this.app = new App();
    }

    public void testExecute()
    {
    	this.app.execute( "####### Exercício GIT Maven Jenkins" );
    	
    	assertTrue(true);
    }
}
