package javachallenge;

public class FindLastWord {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String str = "fly me to the moon";
		int strlength = str.length();
		System.out.println("Charater count of the string: "+strlength);
		
		String[] splitsentence = str.split(" ");
		int splitcount = splitsentence.length;
		System.out.println("Word count after spliting the sentence by delemiter space: "+ splitcount);
		
		for(int i=splitcount-1;i>0;i--)
		{
      System.out.println("Last word in the string is: "+splitsentence[i]+" and the length is: "+splitsentence[i].length());
       break;
	   }
	}
}
