import java.util.*;
class Task4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		String operator;
		System.out.println("Enter the first number :");
		num1=sc.nextInt();
		System.out.println("Enter the second number :");
		num2=sc.nextInt();
		System.out.println("Enter the operation you want to perform(+,-,*,/,%");
		operator=sc.next();
		switch(operator)
		{
			case "+":
			System.out.println(num1+"+"+num2+" = " +(num1+num2));

			break;
			case "-":
			System.out.println(num1+"-"+num2+" = " +(num1-num2));

			break;
			case "*":
			System.out.println(num1+"*"+num2+" = " +(num1*num2));

			break;
			case "/":
			System.out.println(num1+"/"+num2+" = " +(num1/num2));

			break;
			
			default:
			System.out.println("Invalid Operator.");
		}
	}
}