package Exercises;

public class Swap_Strings {
	
	public static void main(String[] args) {
		String n1 = "sandeep";
		String n2 = "belgaonkar";
		int len1 = n1.length();		
		System.out.println("value of n1 - before is "+n1);
		System.out.println("value of n2 - before is "+n2);
		System.out.println("-----------------------------------");
		n1=n1+n2;		
		n2=n1.substring(0, len1);
		n1=n1.substring(len1, n1.length());
		System.out.println("value of n1 - after is "+n1);
		System.out.println("value of n2 - after is "+n2);

	}

}
