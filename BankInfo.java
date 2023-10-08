package polymorphism;

public class BankInfo {

	public void saving()
	{
		System.out.println("saving");
	}
	public void fixed()
	{
		System.out.println("fixed");
	}
	public void deposit()
	{
		System.out.println("deposit");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo bi = new BankInfo();
		bi.deposit();
		bi.fixed();
		bi.saving();

	}

}
