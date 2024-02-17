
import java.util.*;

class reverseString {
	public static void main(String arg[])
	{
		String original,reverse="";
		String result;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String:");
		original=sc.nextLine();
		int length =original.length();
		for(int i=length - 1;i >= 0;i--)
		{
			reverse=reverse+ original.charAt(i);
		}
		System.out.println("Reverse String is:"+ reverse);
		if(original.equals(reverse))
			System.out.println("It is a palindrome string");
		else
		    System.out.println("It is not a palindrome string");
			
	}

}
