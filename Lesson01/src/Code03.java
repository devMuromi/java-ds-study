import java.util.Scanner;

public class Code03 {
	public static void main(String[] args) {
		String str = "Hello,world";
		String input = null; // String is not primitive type

		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please type a string: ");
		input = kb.next();
		
		// == operator only works with primitive type
		if(str.equals(input)) {
			System.out.println("Strings match! :-)");
		}
		else {
			System.out.println("Strings do not match! :-(");
		}
		
		kb.close();
	}

}
