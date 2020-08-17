package week7;

public class typeCassing{
	public static void main(String[]args){
		final double d = 3.14159;
		byte a = 9;
		byte b = 5;
		byte c = (byte) (a+b);
		System.out.println(c);
	}
	
}