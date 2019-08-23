class MyCalculator
{
	long power(int n,int p)throws ArithmeticException
	{
		long power=1;
		try{
			if(p<0 || n<0)
				throw new ArithmeticException("n or p can't be negative!");
			if(p==0 && n==0)
				throw new ArithmeticException("n or p can't be zero");
			for(int i=p;i>=0;i--)
			{
				power*=n;
			}
			return power;
		}
		catch(ArithmeticException a){
			System.out.print(a);
		}
			}

	public static void main(String[] args)
	{	
		MyCalculator mc = new MyCalculator();
		
		System.out.println(mc.power(2,6));
		System.out.println(mc.power(-1,9));
		System.out.println(mc.power(0,0));
	}
}