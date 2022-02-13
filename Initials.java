import java.util.Scanner;

//  Initialise: Write a function named initialise to convert a name into initials.
//	The function should strictly take two words with one space in between
//	them. The output should be two capital letters with a dot separating them.
//	Examples
//	initialise(“Sam Harris”) => “S.H”
//	initialise(“Patrick Feeney”) => “P.F”
//	initialise(“test person”) => “T.P”

public class Initials {

	String name;
	Scanner input;

	public void initialise() {
		//create a scanner class instance to read input data
		input = new Scanner(System.in);
		System.out.println("Please enter your full name:");
		name = input.nextLine();

		String[] separate = name.split(" ");

		//check if split name has length of 2 which indicates it's made up of two words and one space
		if (separate.length == 2) {
			char first = separate[0].charAt(0);
			char second = separate[1].charAt(0);
			String initials = "" + first + "." + second;
			System.out.println(initials.toUpperCase());
		} else {
			System.out.println("Input must only contain first and last name");
		}

		//prompt user to enter required input to continue scanner or terminate process
		System.out.println("Type QUIT to exit or NEW to enter a new input");
		input = new Scanner(System.in);
		if(input.nextLine().equals("QUIT")){
			input.close();
		} else {
			initialise();
		}
	}


	public static void main(String[] args) {
		Initials initial = new Initials();
		initial.initialise();
	}
}
