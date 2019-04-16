import java.util.*;
class Task1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter C++ MARKS : ");
		int cpp_marks = sc.nextInt();
		System.out.println("Enter DATA STRUCTURE MARKS : ");
		int data_str_marks = sc.nextInt();
		System.out.println("Enter OPERATING SYSTEMS MARKS : ");
		int op_sys_marks = sc.nextInt();
		int total_marks= cpp_marks+data_str_marks+op_sys_marks;
		double percent= (percent*100)/300;
		if(percent>=90){
			System.out.println("A GRADE");
		}
		else if ( percent<90 && percent>=80){
			System.out.println("B GRADE");
		}
		else if ( percent<80 && percent>=70){
			System.out.println("C GRADE");
		}
		else if ( percent<70 && percent>=60)
		{
			System.out.println("D GRADE");
		}
		else if ( percent<60){
			System.out.println("F GRADE");
		}
	}

}