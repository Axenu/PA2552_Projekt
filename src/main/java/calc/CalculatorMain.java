package calc;

public class CalculatorMain {
	public CalculatorMain(){

	}
	// Add a and b and return the result
	public int add(int a, int b){
		return a+b;
	}
	// subtract b from a and return the result
	public int sub(int a, int b)
	{
		return a-b;
	}
	// multiply a and b and return the result
	public int mul(int a, int b)
	{
		return a*b;
	}
	// divide a with b and return the result
	public int div(int a, int b)
	{
		//handle divition by zero
		if (b == 0)
			return 0;
		return a / b;
	}
	// calculate a to the power of b
	public int pow(int a, int b)
	{
		int res = a;
		// a simple loop to calculate the power highly efficiently
		for (int i = 1; i < b; ++i)
			res *= a;
		return res;
	}
	// calculate a mod b and return the rest.
	public int mod(int a, int b)
	{
		return a % b;
	}
}
