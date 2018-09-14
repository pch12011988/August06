package NumbersProgram;

import java.util.Arrays;

public class ArrrySort {

	public static void main(String[] args) {
		int a[] = { 1, 5, 7, 4, 8 };
		System.out.println(Arrays.toString(a));

		System.out.println("before sort");
		for (int ele : a) {
			System.out.println(ele);
		}
		Arrays.sort(a);
		System.out.println("after sort");

		for (int ele : a) {
			System.out.println(ele);
		}
		System.out.println(Arrays.toString(a));

		int b[] = { 23, 45, 67, 89 };
		System.out.println(Arrays.toString(b));

		int c[] = new int[a.length + b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for (int i=0;i<b.length;i++) {
			c[i+a.length]=b[i];
			
		}
		System.out.println(Arrays.toString(c));
		//for (int ele1 : c) {
			//System.out.println(ele1);
		}

	}


