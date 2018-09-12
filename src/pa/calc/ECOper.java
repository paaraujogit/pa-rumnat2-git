package pa.calc;

public class ECOper implements ItfOper {

	@Override
	public double oper(double op1, double op2) {
		return op1 * 2 * op2;
	}

}