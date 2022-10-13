package arrays;

import java.util.Arrays;

public class ClassB {

	public static void main(String[] args) {
		int a[] = {23,51,48,68,92,75};
		System.out.println(Arrays.toString(a));
		
		int x = a[0]; // moves 23 into x
		a[0] = a[5]; // moves 75 in place of 23 
		a[5] = x;  // moves 23 which is stored in x in place of 75
		System.out.println(Arrays.toString(a));

	}

}
