import java.util.Scanner;
class Student
{
	private String name;
	private int age;
	private String address;
	public Student()
	{
		name="Unknown";
		age=0;
		address="Unavailable";
	}
	public void setInfo(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void setInfo(String name,int age,String address)
	{
		this.setInfo(name,age);
		this.address=address;
	}
	public static void printInfo(Student[] students)
	{
		for(int i=0;i<students.length;i++)
		{
			System.out.println("Name Of Student No. "+(i+1)+" : ");
			System.out.println(students[i].name);
			System.out.println("Age Of Student No. " +(i+1)+" : ");
			System.out.println(students[i].age);
		}
	}

	public static void main(String[] args) 
	{
		Student student1=new Student();
		Student student2=new Student();
		Student student3=new Student();
		Student student4=new Student();
		Student student5=new Student();
		Student student6=new Student();
		Student student7=new Student();
		Student student8=new Student();
		Student student9=new Student();
		Student student10=new Student();
		Student students[]={student1,student2,student3,student4,student5,student6,student7,student8,student9,student10};
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<students.length;i++)
		{
			System.out.println("Enter Name Of Student No. "+(i+1));
			String name=sc.next();
			System.out.println("Enter Age Of Student No. " +(i+1));
			int   age =sc.nextInt();
			students[i].setInfo(name,age);
		}
		printInfo(students);
	}
}