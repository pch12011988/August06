package mydemo;

import java.util.Scanner;

public class PalindromeStirng {

	public static void main(String[] args) {
		String rev = "";
		System.out.println("enter the string ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for (int i = str.length() - 1; i >= 0; i--) {
			rev =rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println(str+"is palindrome");
		}
		else
		{
		System.out.println(str+"is not palindrome");	
		}
	}

}
