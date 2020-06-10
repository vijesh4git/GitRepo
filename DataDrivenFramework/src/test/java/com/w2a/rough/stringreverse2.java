package com.w2a.rough;

import java.util.Scanner;

public class stringreverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inpstr;
		
		Scanner scan = new Scanner(System.in);
		inpstr = scan.nextLine();
		String reverse = " ";
		int length = inpstr.length();
		for(int i = length-1;i>=0;i--)
		{
			reverse = reverse + inpstr.charAt(i);
		}
      System.out.println("Reverse =" + reverse);
	}

}
