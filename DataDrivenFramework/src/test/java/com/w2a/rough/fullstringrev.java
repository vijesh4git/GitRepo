package com.w2a.rough;

import java.util.Scanner;

public class fullstringrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] str = new String[12];
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String temp = "";
    
    for(int i=str.length()-1;i>=0;i--)
    {
    	temp = temp + str.charAt(i);
    }
    System.out.println(temp);
	}

}
