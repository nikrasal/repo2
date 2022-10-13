package palindrome;

public class DeleteFromString {

	public static void main(String[] args) {
		String a = "nik$#%rasal";
	//	a = a.replaceAll("[^a-zA-Z]","");
		a = a.replaceAll("[#$%]","");
		System.out.println(a);

	}

}