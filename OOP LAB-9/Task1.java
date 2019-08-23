class Test
{
	String str = "a";
	void A()
	{
		try{	
			str +="b";
			B();
		}
		catch (Exception e){
			str += "c";
		}
	}
	void B() throws Exception
	{
		try{
			str += "d";
			C();
		}
		catch(Exception e){
			throw new Exception();
		}
		finally{
			str += "e";
		}
		str += "f";
	}
	void C() throws Exception
	{
		throw new Exception();
	}
	void display()
	{
		System.out.println(str);
	}
	public static void main(String[] args)
	{
		Test object = new Test();
		object.A();
		object.display();
	}
}
// First Of All We Look At the how the call stack is arranging the methods;
// C()
// B()
// A()
// main()
// 1.main is called before all and object of test is created and value of str is set to "a".
// 2.Then the method A() of test is called and the Compiler starts to inkvoke A().
// 3.In A the value of str is concated with "b" and str becomes "ab",then the method B() is invoked
// 4.In B the  value of str is again concated with "d" and str is now = "abd" and C() is called
// 5. In C an Exception is being thrown and then the compiler goest back to previous method i.e B() where C() was called
// 6.in B() there is a try catch which catches the exception thrown by C() and 
// in the catch block another Exception is being thrown then the finally block is executed and str is now = "abde"
// and method B()is exited
// 7.now the compiler checks where B() is invoked and that is in A() then th Exception thrown by B() is caught by
// the try catch in A() and the inside the catch str becomes= "abdec"
// then back to main the method display is called and the value of str i.e ="abdec" is displayed in output;


