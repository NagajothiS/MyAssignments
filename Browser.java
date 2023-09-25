package week1.day2;

public class Browser 
{
	public static void main(String[] args) 
	{
// TODO Auto-generated method stub
   Browser browserObject = new Browser();
   browserObject.launchBrowser("Chrome");
   browserObject.loadurl();
	}	
	
	
 public String launchBrowser(String browserName)
    {
	 System.out.println(browserName+ " Browser launched successfully ");
     return browserName; //doesnt return the value in return sttement//
   
    }
 public void loadurl() 
    {
	 System.out.println("url loaded successfully ");
    }

 
 }
