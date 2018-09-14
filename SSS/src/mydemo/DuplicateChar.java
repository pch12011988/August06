package mydemo;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		char input[] = str.toCharArray();
		System.out.println("Duplicate characters are");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (input[i] == input[j]) {
					System.out.println(input[j]);
					count++;
					break;
				}
			}
		}

	}

}
