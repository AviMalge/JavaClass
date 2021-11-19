package com.programming.session;

public class N1  // number conversion.
// Decimal to binary

{   
	static String decTobin(int num)
	{
		String out=" " ;
		
		while(num>0)
			
		{
		  int rem=num%2;
		
		  out=rem+out;
		
		  num=num/2;
		}
		
		return out;
		
	}

	public static void main(String[] args) 
	
	{
	   String ans=decTobin(35);
	   System.out.println(ans);
		
		
	}
		

}
