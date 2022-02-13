// count the number of 1's in a binary string Given 2 integers A and B, calculate the number of 1's in the binary equivalent of A*B

import java.util.*;

public class BinaryCount {

	public void binaryCounting(int A, int B) {
		int multiplication = A * B;
		List<Integer> binary = new ArrayList<>();
		while (multiplication != 0) {
			int remainder = multiplication % 2;
			binary.add(remainder);
			//binary = remainder + binary;
			multiplication = multiplication / 2;
		}
		Collections.reverse(binary);
		int count = 0;
		for (int b : binary) {
			if (b == 1) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		BinaryCount bc = new BinaryCount();
		bc.binaryCounting(7, 10);
	}
}
