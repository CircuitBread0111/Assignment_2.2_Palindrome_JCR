/**
 * Application.java
 * @author Jerrin C. Redmon
 * 
 */

//Imports
import java.util.Scanner;

public class Application {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		Palindrome test = new Palindrome();
		System.out.println("Welcome to the Palindrome Tester!");
		System.out.println("Please enter your Palindrome: ");
		String word = input.next();
		System.out.println("Is " + word +" a palindrome?: "+ test.isPalindrome(word));
		input.close();
	}

}
