class Dog{
	String name;
	String breed;
	int age;

	Dog(String name,String breed,int age){
 		this.name=name;
 		this.breed=breed;
 		this.age=age; 		
 	}
 	public void showDetails(){
 		System.out.println("****DOG DETAILS****");
 		System.out.println("Name : "+this.name);
 		System.out.println("breed : "+this.breed);
 		System.out.println("Name : "+this.age);
 	}
	public static void main(String args[]){
		Dog dog = new Dog("Tom","BullDog",10);
		dog.showDetails();
		
	}
}