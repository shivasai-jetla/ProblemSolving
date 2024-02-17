class Indexnum
{
public static int[] Arrayindex(int[] num,int[] index)
{
int i=0,k=0;
int target[]=new int[num.length];

while(i<num.length)
{
       for(k=target.length - 1;k > index[i] ; k--)
         {
              target[k] = target[k-1];
              //System.out.print( k + " ");
          }
       target[index[i]] = num[i];
       i++;
}
return target;
}
public static void main(String arg[])
{

int[] num = {0,1,2,3,4};
int[] index = {0,1,2,2,0};
int result[] = new int[num.length];
result=Arrayindex(num,index);
for(int  i: result)
{
System.out.print( i + " " );
}
}
}