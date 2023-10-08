package org.system;

//Desktop class extends the properties of Computer class and will access all the methods inside Computer

public class Desktop extends Computer{

	public void desktopSize()
	{
		System.out.println("17 inch");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop ds = new Desktop();
		ds.computerModel();
		ds.desktopSize();
		
		
	}

}
