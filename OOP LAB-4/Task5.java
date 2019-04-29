import java.util.*;
class Task5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int find=sc.nextInt();
		int arr[]={1,9,5,6,7,3,0};
		boolean found=false;
		for(int i=0;i<arr.length;i++){

			if(arr[i]==find){
				System.out.println(find+"Found At Index = "+i);
				found=true;
			}
		}
		if(!found){
			System.out.println(find+" NOT FOUND IN ARRAY!");
		}
	}
}