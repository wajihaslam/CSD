package Calculator;

public class RPN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int SimpleSum(String resolveOperator)
	{
		int result = 0;
		
		String[] digits =  resolveOperator.split(",");
			
		if(digits[2].equals("+"))
		{
			result = Integer.parseInt(digits[0]) + Integer.parseInt(digits[1]);
		}
		
		return result;
	}

}

