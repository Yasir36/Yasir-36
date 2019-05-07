class Marksheet {

	int oop;
	int dcld;
	int laag;
	Marksheet(int oop,int dcld,int laag){
		this.oop=oop;
		this.dcld=dcld;
		this.laag=laag;
	}
	public int calcObtainedMarks(){
		int obtainedMarks=oop+laag+dcld;
		return obtainedMarks;
	}
	public double calcPercent(){
		double percentage=(obtainedMarks*100)/300;
		return percentage;
	}
	public char calcGrade(){
		if(percentage>=80){return S;}
		else if(percentage>=70 && percentage<80){return A;}
		else if(percentage>=60 && percentage<70){return B;}
		else if(percentage>=50 && percentage<60){return C;}
		else if(percentage>=40 && percentage<50){return F;}
	}
	public static void main(String[] args) {
		Marksheet marksheet=new Marksheet(90,90,90);
	}
}