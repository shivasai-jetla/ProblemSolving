class fibonacci
{
	public static void main(String args[])
	{
	int a=0,b=1,c;
	System.out.print("Fibonacci Series:" +a +" "+ b);
	int i=1;
	while(i<6)
	{
		c=a+b;
		System.out.print(" " + c);
		i++;
		a=b;
		b=c;
	}
	}
}