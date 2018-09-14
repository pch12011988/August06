package NumbersProgram;

import java.util.Scanner;

public class reverseno {

	public static void main(String[] args) {
		int num = 0;
		int revNum = 0;
		int original = 0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		num = original = sc.nextInt();

		while (num != 0) {
			revNum *= 10;
			revNum += num % 10;
			num /= 10;
		}

		System.out.println("rev no of" + original + "is" + revNum);

		if (original == revNum) {
			System.out.println("no is palindrome");
		} else
			System.out.println("no is not palindrome");
	}
}
