package com.programming.session;

public class R4 
{
	
	 static int fact(int n)
	 {    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * fact(n-1));    
	}    
	
	
	public static void main(String[] args) 
	{
		int ans=fact(4);
		System.out.println("the factorial of given no is : "+ans);
		
	}
	
	

}
