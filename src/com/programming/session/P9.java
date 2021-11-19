package com.programming.session;

public class P9 {

	public static void main(String[] args) 
	{
		{
	        int n=5;
	       
			
			for (int r = 1; r<=n; r++)
			{
				int count=1;
				for (int space = 1; space<=n+1; space++)
				{
					System.out.print("  ");
				}
				
				for (int star= 1; 2*r>star ; star++) 
				{
					if(r>star)
					{
						System.out.print(count++ +" ");
					}
					
					else
					{
						System.out.print(count-- +" ");
					}
					
				}
				System.out.println();
				
					
		    }
			
				
				
		}
			

		}

	}

