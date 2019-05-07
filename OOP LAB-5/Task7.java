import java.util.Scanner;
class Students{
	String name;
	String dept;
	int age;
	int objCount=0;
	Students(){
		objCount++;
	}
 	public void showDetails(){
 		System.out.println("****STUDENT"+objCount+" DETAILS****");
 		System.out.println("Name : "+this.name);
 		System.out.println("Dept : "+this.dept);
 		System.out.println("Age : "+this.age);
 	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Student student1 = new Student();
		
		student1.name=sc.next();
		student1.age=sc.nextInt();
		a
		
		Student student2 = new Student();
		student2.name=sc.next();
		student2.age=sc.nextInt();
		
		
		student1.showDetails();
		student2.showDetails();
		
	}
}