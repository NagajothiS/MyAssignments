package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n = 8;
			int firstterm=0, secondterm =1;
			int nextterm = 0;
			
			for (int i = 0; i < n; i++) 
			 {
				
				if (i <= 1)
                nextterm = i;				
				else
				{
					nextterm = firstterm+secondterm;
				
				
				firstterm=secondterm;
				secondterm=nextterm;
				}
				//*/
				
			System.out.println(nextterm);

				}
	}

}
