import java.util.Scanner;
class PrimeN
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter a number to check prime or not: ");
int n=sc.nextInt();
int count=0;
for(int i=1;i<=n;i++)
{
count=0;
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