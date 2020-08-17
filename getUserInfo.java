package week7;

import java.util.Scanner;
public class getUserInfo{
	public static void main(String[]args) {
		String name;
		int age;           
		int a,b,c;
		a=5;
		b=10;
		c=20;
		float total1=a*b+c;
		float total2=a+b*c;
		float total3=(b/a) *c;
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter your name >> ");
		name = inputDevice.nextLine();
		System.out.print("Please enter your age >> ");
		age = inputDevice.nextInt();
		System.out.println("Your name is "+ name + " age " + age);
		System.out.println("Aswer  = "+total1);
		System.out.println("Aswer  = "+total2);
		System.out.println("Aswer  = "+total3);
		 
	}
}