class Printer
{
	public void printIntChar(int a,char b)
	{
		System.out.println(a+" "+b);
	}
	public void printIntChar(char a,int b)
	{
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) 
	{
		Printer printer=new Printer();
		printer.printIntChar(9,'&');
		printer.printIntChar('&',10);
	}
}