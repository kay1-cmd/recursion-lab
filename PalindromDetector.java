
import java.util.Scanner;

public class PalindromDetector {

	public static void main(String[] args) {
		int compInd = 0; //send 0 for starting pointer
		boolean val;
		
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Enter the word you wish to check for a palindrome: ");
		
		String str = kbd.nextLine();
		
		val = isPalin(str, str.length() - 1, compInd);
		
		if(val) {
			
			System.out.println("This sentence is a palindrome");
		}else {
			System.out.println("This sentence is not a palindrome or the program didn't work.");
		}
		
	}
	
	//|| checkStr.length % 2 == 0 && checkStr[endInd] == checkStr[frontInd] && endInd < (checkStr.length - 1)/ 2 
	
	public static boolean isPalin(String checkStr, int endInd, int frontInd) {
		
		//base case 
		if( checkStr.charAt(endInd) != checkStr.charAt(frontInd) ) {
			return false;
		}
		
		//return 0 when the recursive case doesn't trigger the base
		if(frontInd >= endInd ){
				return true;
		}
			
		//recursively call while the last method in the stack doesn't trigger the base case or true	condition
		return isPalin(checkStr, endInd - 1, frontInd + 1 );

		
				
		
		
		}
}
