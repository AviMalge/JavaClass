package com.programming.session;

public class P6 //triangle 2
{

	public static void main(String[] args) 
	{
        int n=10;
		
		for (int r = 1; r<=n; r++)
		{
			for (int c = 1; r+c<=n+1; c++)//(int c = 1;c<=n; c++)
			{
				/*if (r+c<=n+1) 
				{
				System.out.print(" * ");
				}*/
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
		

	}

}
