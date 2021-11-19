package com.programming.session;

public class P2 { //square for odd number with diagonal

	public static void main(String[] args) {
		int n=15;
		
		for( int r=1;r<=n;r++)
		{
		  for( int c=1;c<=n;c++)
		  {
			  if(r==1||r==n||c==1||c==n||r==c||r+c==n+1||c==n/2+1||r==n/2+1)
			  {
				  System.out.print("* ");
			  }
			  else 
			  {
				System.out.print("  ");  
			  }
			  
		  }
		  System.out.println();
		}
			}

	}

