/**
 * Palindrome.java
 * @author Jerrin C. Redmon
 *
 */

//Imports
import java.util.Stack;

public class Palindrome {
	
	Stack<Character> charStack = new Stack<Character>();
	
	/**
	 * @param text The string which the user input
	 * @return true if string is a palindrome, false if not
	 */
	public boolean isPalindrome(String text) {
		for(int i = 0; i < text.length(); i++) {
			charStack.push(text.charAt(i));
		}
		char charArray[] = text.toCharArray();
		for(int i = 0; i < charArray.length; i++) {
			if (charArray[i] != charStack.pop()) {
				return false;
			}
		}
		return true;
		
	}


}