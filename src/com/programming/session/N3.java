package com.programming.session;

public class N3  // number conversion.
//Decimal to hexa

{   
	static String decTohex(int num)
	{
		String out=" " ;
		
		while(num>0)
			
		{
		  int rem=num%16;
		
		  out=rem+out;
		
		  num=num/16;
		}
		
		return out;
		
	}

	public static void main(String[] args) 
	
	{
	   String ans=decTohex(175);
	   System.out.println(ans);
		
		
	}
		

}