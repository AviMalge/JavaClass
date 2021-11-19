package com.programming.session;

public class P7 
{

	public static void main(String[] args)
	{
        int n=5;
		
		for (int r = 1; r<=n; r++)
		{
			for (int c = 1; c<=n; c++)
			{
				if(c>=r)
				{
				System.out.print("* ");
				}
				else if (r>c)
				{
				System.out.print("  ");
				}
			}
			
			System.out.println();
		}
		

	}

}
