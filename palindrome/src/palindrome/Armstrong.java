package palindrome;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no ");
		int n = sc.nextInt();
		int temp,r;
		int sum = 0;
		temp= n;
		while(n>0)
		{
			r = n%10;
			sum = sum +(r*r*r);
			n = n/10;
		}
		if(temp==sum)
		{
			System.out.println("no is armstrong");
		}
	}

}
