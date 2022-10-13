package reverse;

public class Total_count_of_char {

	public static void main(String[] args)
	{
		String a = "to find occurences of particular character in sring";
		int count = 0;
		char k = 'o';
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==k)
			{
				count++;
			}
		}
	
		 System.out.println("count is " + count);
	}

}
