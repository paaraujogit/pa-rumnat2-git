package pa.calc;

import pa.calc.ItfOper;

public class RCOper implements ItfOper {

	@Override
	public double oper(double op1, double op2) {
		return op1*7*op2; 
	}

}