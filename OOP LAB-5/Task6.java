import java.util.Scanner;
class Student{
	String name;
	String rollNo;
	int age;

	Student(){
 		name="Muhammad Yasir";
 		rollNo="18SW36";
 		age=18;	
 	}
 	public void showDetails(){
 		System.out.println("****STUDENT DETAILS****");
 		System.out.println("Name : "+this.name);
 		System.out.println("RollNo : "+this.rollNo);
 		System.out.println("Name : "+this.age);
 	}
}
class Marksheet {

	int oop;
	int dcld;
	int laag;
	int obtainedMarks;
	double percentage;
	Marksheet(){
		oop=90;
		dcld=80;
		laag=80;
	}
	public int calcObtainedMarks(){
	    obtainedMarks=oop+laag+dcld;
		return obtainedMarks;
	}
	public double calcPercent(){
		percentage=(obtainedMarks*100)/300;
		return percentage;
	}
	public char calcGrade(){
		if(percentage>=80 && percentage <=100){return 'S';}
		else if(percentage>=70 && percentage<80){return 'A';}
		else if(percentage>=60 && percentage<70){return 'B';}
		else if(percentage>=50 && percentage<60){return 'C';}
		return 'F';
	}
}
class Result{
	String name;
	String rollNo;
	int age;
	int oop;
	int dcld;
	int laag;
	int obtainedMarks;
	double percentage;	
	char grade;
	Result(Student student,Marksheet marksheet){
		this.name=student.name;
		this.rollNo=student.rollNo;
		this.age=student.age;
		this.oop=marksheet.oop;
		this.laag=marksheet.laag;
		this.dcld=marksheet.dcld;
	}
	public void createStudentResult(Student student,Marksheet marksheet){
		student.showDetails();
		obtainedMarks=marksheet.calcObtainedMarks();
		percentage=marksheet.calcPercent();
		grade= marksheet.calcGrade();
		System.out.println("****MARKSHEET OF STUDENT****");
		System.out.println("Marks in OOP  : "+this.oop +" out of 100.");
		System.out.println("Marks in DCLD : "+this.dcld+" out of 100.");
		System.out.println("Marks in LAAG : "+this.laag+" out of 100.");
		System.out.println("Total Marks   : "+this.obtainedMarks+" out of 300.");
		System.out.println("Percentage    : "+this.percentage+"% out of 100.");
		System.out.println("Grade         : "+this.grade);
		if(this.grade!='F'){
		System.out.println("Remarks       : "+"PASS.");
		}else{
		System.out.println("Remarks       : "+"FAIL.");
		}
	}

	public static void main(String[] args) {
		Student student=new Student();
		Marksheet marksheet=new Marksheet();
		Result result=new Result(student,marksheet);
		result.createStudentResult(student,marksheet);
	}
}