package reverse;

public class ReverseEachWord {

	public static void main(String[] args) {
		String a = "my name is nkhil";
		String reverse = "";
		String words[] = a.split(" ");
		for(int i =0;i<words.length;i++)   //split the string in words
		{
			String word = words[i];
			String reverseWord = "";
			for(int j =word.length()-1;j>=0;j--)    //reversing each word
			{
				reverseWord = reverseWord + word.charAt(j);
			}
			reverse = reverse + reverseWord +" ";    //appending reverseword to reverse
		}
		     System.out.println(a);
             System.out.println(reverse);
	}

}
