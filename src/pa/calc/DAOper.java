package pa.calc;

public class DAOper implements ItfOper {

	@Override
	public double oper(double op1, double op2) {
		return op1+4*op2;
	}

}
