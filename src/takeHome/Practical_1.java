package takeHome;

import java.util.Arrays;
import java.util.Random;

public class Practical_1 {
	/*
	 * Question: Generate 500 random numbers and print the nth smallest number in a
	 * programming language of your choice. (Ask user for the Nth smallest number)
	 */
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		int[] numbers = genrateRandomNumber(1, 1000);
		for (int arr : numbers) {
			System.out.print(arr + " ");
		}
		System.out.println("");
		try {
			nthSmallest(numbers, 10);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Nth value is out of bound, please select another nth value.");
			// e.printStackTrace();
		}
	}

	public static int[] genrateRandomNumber(int min, int max) {
		Random ran = new Random();
		int[] myRandomNumbers = new int[500];
		for (int i = 0; i < 500; i++) {
			myRandomNumbers[i] = ran.nextInt(max - min) + min;
		}
		return myRandomNumbers;

	}

	public static int nthSmallest(int[] numbers, int nth) {
		Arrays.sort(numbers);
		int[] distinctNum = Arrays.stream(numbers).distinct().toArray();
		for (int arr : distinctNum) {
			System.out.print(arr + " ");
		}
		System.out.println("");
		if (distinctNum.length >= nth) {
			System.out.println("The " + nth + "th smallest number is: " + distinctNum[nth - 1]);
		} else
			throw new ArrayIndexOutOfBoundsException();

		return distinctNum[nth - 1];

	}

}
