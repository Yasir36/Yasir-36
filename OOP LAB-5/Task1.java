import java.util.*;
class Task1

{
	int arr[]= new int[10];
	int even=0,odd=0;
	// array initaializer 
	public void populateArray()
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){arr[i]=sc.nextInt();}		
	}
	//Even Odd Counter
	public void countArray()
	{
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]%2==0){
				this.even++;
			}
			else{
				this.odd++;
			}
		}
	}
	//MAIN
	public static void main(String args[])
	{
		Task1 arrr = new Task1();
		arrr.populateArray();
		arrr.countArray();
		System.out.println("No. of even numbers in array = "+arrr.even+"\n"+"No. of odd numbers in array = "+arrr.odd);
	}
  	
}