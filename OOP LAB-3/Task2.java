import java.util.*;
class Task2{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int units=sc.nextInt();
	int tBill=0;
	if(units>300){
			
		tBill+= (units-300)*30; 
		units=300;
	}
	if(units>200&&units<=300){
		
		tBill+=(units-200)*25;
		units=200;
	}
	if(units>100&&units<=200){
		
		tBill+=(units-100)*20;
		units=100;
	}
	if(units>50&&units<=100){
	
		tBill+=(units-50)*15;	
		units=50;
	}
	if(units>0 && units<=50){
		tBill+=units*10;
		units=0;
	}
		System.out.println("Total Bill = "+tBill);
	}
	
		
	}
