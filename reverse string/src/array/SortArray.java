package array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int a [] = {42,56,32,28,85};
		System.out.println(Arrays.toString(a));
		for(int i= 0;i<a.length-1;i++)
		{
			for(int j =i+1;j<a.length;j++)
			{
				if(a[i]>a[j])   //sort in ascending
				{
					int k = a[j];
					a[j] = a[i];
					a[i] = k;
				}
			}
		}
        System.out.println(Arrays.toString(a));
	}

}
