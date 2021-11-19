package com.programming.session;

public class R2 
{
	
		public static void display(int a) 
		{
			
			if(a<=10)
			{
		    System.out.println(" value "+a);	
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


