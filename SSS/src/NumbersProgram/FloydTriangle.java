package NumbersProgram;

import java.util.Scanner;

public class FloydTriangle {

	private static Scanner sc1;

	public static void main(String[] args) {
		int rows, num = 1, counter, i;
		sc1 = new Scanner(System.in);
		System.out.println("enter the no of rows");

		rows = sc1.nextInt();
		for (counter = 1; counter <= rows; counter++) {
			for (i = 1; i <= counter; i++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
}
 