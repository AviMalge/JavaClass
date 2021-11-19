package com.abstraction.my;
import com.abstraction.my.*;


public class Programming 

{
  Language using(char type)
  {
	  if(type=='J')
	  {
		  return new Java();
	  }
	  else
	  {
		  return new Python();
	  }
  }
}