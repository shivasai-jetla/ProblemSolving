class gcd
{
static int gcd(int x,int y)
{
if(x==0)
{
return y;
}
if(x==0)
{
return x;
}
if(x==y)
{
return x;
}
if(x>y)
{
return gcd(x-y,y);
}
return gcd(x,y-x);
}
public static void main(String args[])
{
int x=100,y=88;
int gcd=gcd(x,y);
System.out.print(gcd);
}
}

