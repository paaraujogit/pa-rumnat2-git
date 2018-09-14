package pa.app;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = Logger.getLogger( App.class.getName() );
	
	public App() 
	{
		super();
	}
	
    public void execute( String mensagem )
    {
    	logger.log( Level.INFO , mensagem );
    }
    
    public double somar( double valor1, double valor2 )
    {
    	return valor1 + valor2;
    }
    
    public double subtrair( double valor1, double valor2 )
    {
    	return valor1 - valor2;
    }
    
    public double multiplicar( double valor1, double valor2 )
    {
    	return truncar( valor1 * valor2, 2 );
    }
    
    public double dividir( double valor1, double valor2 )
    {
    	return truncar( valor1 / valor2, 2 );
    }
    
    public double truncar( final double valor, final int decimais )
	{
		final NumberFormat numberFormat = NumberFormat.getNumberInstance( Locale.US );
		numberFormat.setGroupingUsed( false );
		numberFormat.setMinimumFractionDigits( decimais + 10 + 1 );
		numberFormat.setMaximumFractionDigits( decimais + 10 + 1 );
		return truncar( valor, numberFormat , decimais );
	}

	private double truncar( final double valor, final NumberFormat numberFormat, final int decimais )
	{
		final String valorReplace = numberFormat.format( valor ).replace( ".", ";" );
		final String[] valorString = valorReplace.split( ";" );

		valorString[1] = valorString[1].concat( "000000000000000" );

		return Double.valueOf( valorString[0] + "." + valorString[1].substring( 0, decimais ) );
	}
}
