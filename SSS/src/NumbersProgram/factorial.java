package NumbersProgram;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		System.out.println("enter the no");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int fact = no;
		for (int i = 1; i <no; i++) {

			fact = fact * i;

		}

		System.out.println("the fact of no is" + fact);
	}

}
