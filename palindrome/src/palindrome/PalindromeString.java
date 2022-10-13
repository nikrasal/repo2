package palindrome;

public class PalindromeString {

	public static void main(String[] args) {
		String a = "level";
		String reverse  = "";
		System.out.println("the word is " + a);
        for(int i=a.length()-1;i>=0;i--)
        {
        	reverse = reverse +a.charAt(i);
        }
        if(a.equals(reverse))
        	
        {
        	System.out.println("it is palindrome");
        }
	}

}
