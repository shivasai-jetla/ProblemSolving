import java.util.Scanner;
public class armstrong {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number:");	
		int n=sc.nextInt();	
		int m=n;
		int sum=0;
		while(n>0)
		{
			int t=n%10;
			n=n/10;
			sum+=(t*t*t);
		}
		if(sum==m)
			System.out.println("Armstrong");
		else
			System.out.println("Not an Armstrong");
	}

}
