import java.util.Scanner;

//	Reverse Number: Given a number, write a function named reverseNumber
//	to output its reverse digits. (e.g. given 123 the answer is 321)
//	Numbers should preserve their sign; i.e. a negative number should still be
//	negative when reversed.
//	Examples
//	reverseNumber(123) => 321
//	reverseNumber(-456) => -654
//	reverseNumber(1000) => 1

public class ReverseNum {

	Scanner input;
	int number;
	int reverse;

	public void reverseNumber(){
		reverse = 0;
		input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		number = input.nextInt();

		//multiply the previous reverse value by 10, add the current remainder to it, save it in the variable,
		//and update the input number by dividing it by 10
		while(number > 0 || number < 0){
			reverse = reverse*10 + number%10;
			number = number/10;
		}
		System.out.println("Reversed number: " + reverse);

		//prompt user to enter required input to continue scanner or terminate process
		System.out.println("Type QUIT to exit or NEW to enter a new input");
		input = new Scanner(System.in);
		if(input.nextLine().equals("QUIT")){
			input.close();
		} else {
			reverseNumber();
		}
	}

	public static void main(String[] args) {
		ReverseNum num = new ReverseNum();
		num.reverseNumber();
	}
}
