package com.w2a.rough;

import java.util.List;

import org.openqa.selenium.WebElement;

/*
 * class statictraining1 {
 * 
 * int rollno; String name; static String college = "COEM";
 * 
 * statictraining1(int r, String n) { rollno = r; name = n; }
 * 
 * void display() { System.out.println(rollno + " " + name + " " + college); }
 * 
 * public static void main(String args[]) { statictraining1 s1 = new
 * statictraining1(111, "John"); statictraining1 s2 = new statictraining1(222,
 * "Jerry"); s1.display(); s2.display(); }
 * 
 * 
 * }
 */
class statictraining1 {
	 static int add(int x, int y) {
	  return x + y;
	 }

	 public static void main(String args[]) {
	  //int result = statictraining1.add(5, 5);
		 int result = statictraining1.add(10, 20);
		 //List<WebElement> links = driver.findElements(By.tagName("a"));
	  System.out.println(result);
	 }
	}

