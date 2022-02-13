import java.util.Scanner;

//	Odd Count: Given a number n, write a function named oddCount to return
//	the number of positive odd numbers below n.
//	Examples
//	oddCount(7) => 3, (i.e [1, 3, 5])
//	oddCount(8) => 4, (i.e [1, 3, 5, 7])
//	oddCount(15) => 7, (i.e [1, 3, 5, 7, 9, 11, 13])
//	oddCount(4127356121254) => 2063678060627
//	Note: Expect large Inputs!

public class OddCount {

	Scanner input;
	long number;

	public void oddCount() {
		//create a scanner class instance to read input data
		input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		number = input.nextLong();

		//calculate the number of positive odd numbers below given number by dividing it by 2
		//this method reduces runtime to avoid time out
		long positiveCount = number /2;

		System.out.println(positiveCount);

		//prompt user to enter required input to continue scanner or terminate process
		System.out.println("Type QUIT to exit or NEW to enter a new input");
		input = new Scanner(System.in);
		if(input.nextLine().equals("QUIT")){
			input.close();
		} else {
			oddCount();
		}
	}

	public static void main(String[] args) {
		OddCount count = new OddCount();
		count.oddCount();
	}
}
