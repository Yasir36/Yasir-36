package OOPLab8.Task1;



interface AdvancedArithmetic
{
	public int sumOfFactors(int n);
}

class MyCalculator implements AdvancedArithmetic
{
	public int sumOfFactors(int n)
	{
		if(n<=1000)
		{
			int sum=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
					sum+=i;
			}
		return sum;
		}
		else{
			System.out.println("n can't be greater than 1000");
			return 0;
		}
	}

	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.sumOfFactors(6));
		System.out.println(mc.sumOfFactors(1001));
		System.out.println(mc.sumOfFactors(12));
	}
}