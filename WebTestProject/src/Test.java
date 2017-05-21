import static org.junit.Assert.*;
import Calculator.RPN;


public class Test{

	@org.junit.Test
	public void testCalculatorSimpleSum() {
		int result;
		String resolveOperator = "1,3,+";
		result = RPN.SimpleSum(resolveOperator);		
		assertEquals(4,result);
		
		/// just added the comments 
		//fail("Not yet implemented");
	}

}
