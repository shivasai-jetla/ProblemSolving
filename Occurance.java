import java.util.*;
class Occurance
{
static int display(int[] nums,int key)
{
int temp[]=new int[nums.length];
int j=0;
for(int i=0;i<nums.length;i++)
{ 
	if(nums[i] != key)
	{
		temp[j]=nums[i];
		j++;
	}
}
for(int i=0;i<j;i++)
{
	nums[i]=temp[i];
}
return j;
}
public static void main(String args[])
{
int nums[] = {1,2,4,3,4,3,6,5};
int key=3;
int k=display(nums, key);
for(int i=0;i<k;i++)
{
System.out.print(nums[i] + " ");
}
}
}
