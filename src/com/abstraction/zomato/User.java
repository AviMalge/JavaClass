package com.abstraction.zomato;
import com.abstraction.zomato.*;


public class User 
{
 public static void main(String[] args) 
 {
	Zomato z1= new Zomato();
	OnlineResto ref= z1.orderfood('m');
	ref.displaymenu();
	ref.order();
 }
}
