package mydemo;

public class charcount {

	public static void main(String[] args) {
		String s = "PRASHANT";
		//char a[] = s.toCharArray();
		int l = s.length();
		int count = 0;
		for (int i = 1; i <= l; i++) {

			count++;
		}
		System.out.println("no of chars in string s are:" + count);
	}

}
