import java.util.*;
class Task3B{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number :-");
		int number=sc.nextInt();
		int sum=0;
		while(number>0){
			sum+=number%10;
			number/=10;
		}
		System.out.println("Sum Of The Digits Of Given Number : "+sum);
	}
}