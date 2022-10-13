package reverse;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = {2,8,4,3};
//		for(int i= 0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]+ "");
//		}
	System.out.println(Arrays.toString(arr));
		
		for(int i =arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
