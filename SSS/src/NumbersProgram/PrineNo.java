package NumbersProgram;

import java.util.Scanner;

public class PrineNo {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int i = 2;
		boolean flag = false;
		while (i <= no / 2) {
			if (no % i == 0) {
				flag = true;
				break;
			}
			++i;
		}
		if (!flag)
			System.out.println("no is prime no");
		else
			System.out.println("no os not prime no");

	}

}
