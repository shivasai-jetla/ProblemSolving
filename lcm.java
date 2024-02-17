class lcm{
public static void main(String[] args)
{
int a=15,b=25;
int ans;
if(a>b)
{
ans=a;
}
else
{
ans=b;
}
while(true)
{
if(ans%a==0&&ans%b==0)
{
break;
}
ans++;
}
System.out.print(ans);
}
}