package polymorphism;
//method overriding

public class AxisBank extends BankInfo{

	public void deposit()
	{
		super.deposit();
		System.out.println("Axis bank deposit");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AxisBank ab = new AxisBank();
		ab.deposit();
		ab.fixed();
		
		ab.saving();
	}

}
