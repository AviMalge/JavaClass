package com.programming.session;

public class R3 
{
	
			public static void display1(int a) 
			{
				
				if(a>0)
				{
			    System.out.print(a+" ");	
				a--;
				display1(a);
				}
				
			}
			
			public static void display2(int a) 
			{
				
				if(a<10)
				{
			    System.out.print(a+" ");	
				a++;
				display2(a);
				}
			}
			
			
			public static void main(String[] args) 
			{
				System.out.println(" main method ");
				display1(9);
				display2(2);
				
				
			}

}


