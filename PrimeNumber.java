import java.util.Scanner;

class PrimeNumber
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number to find prime numbers upto : ");
	int n=sc.nextInt();
	for(int i=2;i<=n;i++)
	{
		int count=0;
		for(int j=2;j<=i;j++)
		{
			if(i%j==0)
			{
			count++;
			}
		}
		if(count<=1)
		{
		System.out.print(" "+i+" ");
		}
	}
	}
}