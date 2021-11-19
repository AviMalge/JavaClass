package com.abstraction.zomato;
import com.abstraction.zomato.*;

public class Zomato 
{
  OnlineResto orderfood(char type)
  {
	  if(type=='m')
	  {
		  return new McDonald();
	  }
	  else
	  {
		  return new BurgerKing();
	  }
  }
}
