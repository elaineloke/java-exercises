import java.util.Scanner;

//	Triple Trouble: Create a function named tripleTrouble that will return a
//	string that combines all of the letters of the three inputted strings in
//	groups. Taking the first letter of all of the inputs and grouping them next to
//	each other. Do this for every letter, see example below!
//	Examples
//	tripleTrouble("aa", "bb" , "cc") => "abcabc"
//	tripleTrouble("nace", "oths" , "vett") => "novatechtest"
//	Note: You can expect all of the inputs to be the same length.

public class TripleTrouble {

	Scanner input;
	String a;
	String b;
	String c;

	public void tripleTrouble() {
		//create scanner instance to get three inputs from user
		input = new Scanner(System.in);
		System.out.println("Please enter your first string:");
		a = input.nextLine();
		System.out.println("Please enter your second string:");
		b = input.nextLine();
		System.out.println("Please enter your third string:");
		c = input.nextLine();

		StringBuilder result = new StringBuilder();

		//loop through all three input strings and append each character into StringBuilder result
		for(int i=0; i<a.length(); i++){
			result.append(a.charAt(i));
			result.append(b.charAt(i));
			result.append(c.charAt(i));
		}
		System.out.println("Your combined string is: " + result);

		//prompt user to enter required input to continue scanner or terminate process
		System.out.println("Type QUIT to exit or NEW to enter a new input");
		input = new Scanner(System.in);
		if(input.nextLine().equals("QUIT")){
			input.close();
		} else {
			tripleTrouble();
		}
	}


	public static void main(String[] args) {
		TripleTrouble trouble = new TripleTrouble();
			trouble.tripleTrouble();
	}
}
