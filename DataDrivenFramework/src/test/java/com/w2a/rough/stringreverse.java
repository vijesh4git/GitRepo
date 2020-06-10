package com.w2a.rough;

import java.util.Scanner;

public class stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = new String[20];
		String reverse = " ";
		 Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		name= scan.nextLine().split("//s");
	    for(int i=name.length-1;i>=0;i--)
	    {
	    	reverse =  name[i] + reverse;  
	    
	    	
	    }
       System.out.println(reverse);
	}

}
