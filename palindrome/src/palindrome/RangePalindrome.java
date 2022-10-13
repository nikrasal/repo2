package palindrome;

import java.util.Scanner;

public class RangePalindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the range");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		for(int i=num1;i<=num2;i++)	{	//for taking input range from user
	
	//	for(int i=11;i<=200;i++) {		giving range in for loop	
		int n = i;
		int rev = 0;
		
	    while(n>0)
		{
			int rem = n%10;          //we get remainder
			rev = (rev*10)+rem;  
			n = n/10;          //we divide by 10 so that we get remaining digits in while loop
			
		    if(rev==i)
			  {
				   System.out.println(i+" ");
			  }
			
		 }
		}	

	}

}
