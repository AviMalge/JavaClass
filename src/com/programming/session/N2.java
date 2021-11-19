package com.programming.session;

public class N2  // number conversion.
//Decimal to octal

{   
	static String decTooct(int num)
	{
		String out=" " ;
		
		while(num>0)
			
		{
		  int rem=num%8;
		
		  out=rem+out;
		
		  num=num/8;
		}
		
		return out;
		
	}

	public static void main(String[] args) 
	
	{
	   String ans=decTooct(35);
	   System.out.println(ans);
		
		
	}
		

}
