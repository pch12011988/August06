package NumbersProgram;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		int originalNumber, remainder, result = 0;
		int num;
		System.out.println("enter the number ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		originalNumber = num;

		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result+=Math.pow(remainder, 3);
			originalNumber /= 10;
		}
		if (result == num) {
			System.out.println("no is Armstrong No");
		}

		else {
			System.out.println("no is not ArmStrong No");
		}
	}

}
