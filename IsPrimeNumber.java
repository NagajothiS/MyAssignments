package week1.day2;

public class IsPrimeNumber 
{
	public static void main(String[] args) 
	{
		int n = 2;     // input
		int count = 0; //intiating count to 0 
		for (int i = 2; i < n-1; i++) 
		{
			// checking the remainder is 0 then increase the count
			if(n % i == 0)
			count++;
			
		}
		if (count > 0)
			System.out.println(n + " : is not a prime number ");
		else 
			System.out.println(n + " : is a prime number ");

	}

}
