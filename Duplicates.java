import java.util.*;

//	Duplicates: Write a function named duplicates which will return the count
//	of distinct case-insensitive alphabetic characters and numeric digits that
//	occur more than once in the input string. The input string can be assumed
//	to contain only alphabets (both uppercase and lowercase) and numeric
//	digits.
//	Examples
//	duplicates("abcde") => 0 (i.e. no duplicated characters)
//	duplicates("aabbcde") => 2 (i.e. 'a' and 'b')
//	duplicates("aabBcde") => 2 (i.e. 'a' and 'b' / ’B’)
//	duplicates("indivisibility") => 1 (i.e. 'i')
//	duplicates("Indivisibilities") => 2 (i.e. 'i' and 's')
//	duplicates("aA11") => 2 (i.e. 'a' and '1')
//	duplicates("ABBA") => 2 (i.e. 'A' and 'B')

public class Duplicates {

	Scanner input;
	String checkString;

	public void duplicates(){
		input = new Scanner(System.in);
		System.out.println("Please enter a string:");
		checkString = input.nextLine();

		//convert string to lowercase and into charArray
		String lower = checkString.toLowerCase();
		char[] charArray = lower.toCharArray();
		String repeats = "";
		int count =0;

		//loop through each character and check against String repeats if it's repeated
		//if it's repeated, increase count and concat it to String repeats for future reference
		for(int i=0; i<charArray.length; i++) {

			//convert characters to string so that we can check character at each index
			//first if-statement checks if character is present in String repeats
			//second if-statement checks if the remaining charArray matches with current character
			String character = Character.toString(charArray[i]);
			if (!repeats.contains(character)) {
				if (lower.substring(i + 1).contains(character)) {
					count++;
					repeats = repeats + character;
				}
			}
		}
		System.out.println(count);

		//prompt user to enter required input to continue scanner or terminate process
		System.out.println("Type QUIT to exit or NEW to enter a new input");
		input = new Scanner(System.in);
		if(input.nextLine().equals("QUIT")){
			input.close();
		} else {
			duplicates();
		}
	}

	public static void main(String[] args) {
		Duplicates dup = new Duplicates();
		dup.duplicates();
	}
}
