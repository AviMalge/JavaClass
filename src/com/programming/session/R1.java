package com.programming.session;

public class R1 // Recursion
{

	public static void display(int a) 
	{
		
		if(a<=3)
		{
	    System.out.println(" executing display "+a);	
		a++;
		display(a);
		}
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println(" main method ");
		display(1);
		
	}

}
