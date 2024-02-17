class sumElements
{
public static void main(String args[])
{
int a[]={2,3,4};
int b[]={8,7,6};
int c[]=new int[3];
int len=a.length;
int sum=0;
int carry=0;
int result;
for(int i=len-1;i>=0;i--)
{
//int carry=0;
sum=a[i]+b[i];
 if(i==0&&sum>9)
{
c[i]=sum+carry;
carry--;
}
else if(sum>9)
{
result=sum%10;
c[i]=result;
carry++;
}
else if(carry>0)
{
c[i]=sum+carry;
carry--;
}
else
{
c[i]=sum;
}
}
for(int i:c)
{
System.out.print(i+" ");
}
}
}