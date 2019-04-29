import java.util.*;
class Task2{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number To Print The Table Of : ");
		int num   = sc.nextInt();
		System.out.println("Enter The Starting Point For The Table : ");
		int start = sc.nextInt();
		System.out.println("Enter The Ending Point For The Table   : ");
		int end   = sc.nextInt();
		System.out.println("The Table Of "+num+" From "+start+" To "+end+" :");
		for(int i=start;i<=end;i++){
			System.out.println(num+"x"+i+" = "+num*i);
		}
	}
}