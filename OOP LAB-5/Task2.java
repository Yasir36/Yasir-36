 import java.util.*;
 class Dog{
 	String name;
 	String breed;
 	int age;

 	public void setDetails(String name,String breed,int age){
 		this.name=name;
 		this.breed=breed;
 		this.age=age; 		
 	}
 	public void showDetails(){
 		if(name!=null && breed!=null && age>=0){
 		System.out.println("****DOG DETAILS****");
 		System.out.println("Name : "+this.name);
 		System.out.println("Breed : "+this.breed);
 		System.out.println("Name : "+this.age);
 		}
 		else{
 			System.out.println("DETAILS ARE UNAVAILABLE/NOT PROVIDED!!");
 		}
 	}


 	public static void main(String args[]){
 		Dog dog=new Dog();
 		Scanner sc = new Scanner(System.in);
 		dog.setDetails("Tom","BullDog",18);
 		dog.showDetails();


 	}
 	
 }