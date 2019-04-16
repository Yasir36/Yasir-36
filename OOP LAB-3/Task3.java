import java.util.*;
class Task3{
	public static void main(String[] args) {

		String input;
		System.out.println("Enter Any Letter :");
		Scanner sc = new Scanner(System.in);
		input=sc.next();
		switch(input)
		{
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			System.out.println("Character is A Vowel. ");
			break;

			default:
			System.out.println("Character is A Consonant. ");
		}
	}
}