package bank_system;

public class BankSystem {
	int previousBalence = 5000;

	public static void main(String[] args) {
		System.out.println("SBI");
		BankSystem obj = new BankSystem();
		obj.deposite("nikhil",2000, 3000);   //object name.method name

	}
	
	public  void deposite(String name, int depositeAmount,int withdraw)
	{
		int currentBal = previousBalence;
		int BalAfterDeposite = currentBal + depositeAmount;
		int BalAfterwithdraw = BalAfterDeposite  - withdraw;
		
		System.out.println("name is " + name);
		System.out.println("currentBal " + currentBal);
		System.out.println("deposite " + depositeAmount);
		System.out.println("BalAfterDeposite " + BalAfterDeposite);
		System.out.println("withdraw amout " + withdraw);
		System.out.println("balence after withdraw " + BalAfterwithdraw);
		
	}
	


}
