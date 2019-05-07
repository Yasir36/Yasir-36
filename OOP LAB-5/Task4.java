class Student{
	String name;
	String rollNo;
	int age;

	Student(String name,String rollNo,int age){
 		this.name=name;
 		this.rollNo=rollNo;
 		this.age=age; 		
 	}
 	public void showDetails(){
 		System.out.println("****STUDENT DETAILS****");
 		System.out.println("Name : "+this.name);
 		System.out.println("RollNo : "+this.rollNo);
 		System.out.println("Name : "+this.age);
 	}
	public static void main(String args[]){
		Student student = new Student("Yasir","18SW36",18);
		student.showDetails();
		
	}
}