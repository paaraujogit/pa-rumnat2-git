package pa.app;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Hello world!
 *
 */
public class App 
{
    public void execute( String mensagem )
    {
    	System.out.println( mensagem );
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
    
    private static double truncar( final double valor, final int decimais )
	{
		final NumberFormat numberFormat = NumberFormat.getNumberInstance( Locale.US );
		numberFormat.setGroupingUsed( false );
		numberFormat.setMinimumFractionDigits( decimais + 10 + 1 );
		numberFormat.setMaximumFractionDigits( decimais + 10 + 1 );;
		return truncar( valor, numberFormat , decimais );
	}

	private static double truncar( final double valor, final NumberFormat numberFormat, final int decimais )
	{
		if ( !Double.isNaN( valor ) && !Double.isInfinite( valor ) )
		{
			final String valorReplace = numberFormat.format( valor ).replace( ".", ";" );
			final String[] valorString = valorReplace.split( ";" );

			if ( valorString.length == 2 )
			{
				valorString[1] = valorString[1].concat( "000000000000000" );
			}
			else
			{
				valorString[1] = "000000000000000";
			}

			return Double.valueOf( valorString[0] + "." + valorString[1].substring( 0, decimais ) );
		}
		return valor;
	}
}
