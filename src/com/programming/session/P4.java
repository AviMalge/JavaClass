package com.programming.session;

public class P4 { // works for odd numbers

	
	public static void main(String[] args) {
		int n=5;
		int count=1;
		int temp=2;
		
		for( int r=1;r<=n;r++)
		{
		  for( int c=1;c<=n;c++)
		  {
			
				  System.out.print(count+"  ");
				  count++;
		   }
		  if(r<=n/2)
		  {
			  count=count+n;
		  }
		  else if (r>=n/2)
		  {
			  count=count-(n*temp++);  
		  }
		  
		  System.out.println();
			 
		}
	
		}
			}

