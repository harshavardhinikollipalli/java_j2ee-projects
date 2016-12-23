package oops;
import java.util.*;
public class Bubble {
	public static void main(String[]args)
	{
	int i,j,temp=0;
	Scanner sc=new Scanner(System.in);
		System.out.println("enter array");
		int arr[]=new int[4];
	for(int k=0;k<=arr.length-1;k++)
	{
	arr[k]=sc.nextInt();
	}
   for(i=0;i<arr.length-1;i++)
	{
		for(j=1;j<(arr.length-i);j++)
		{
			if(arr[j-1]>arr[j])
			{
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				
			}
		}
	}
	System.out.println("array after sort");
	for( j=0;j<=arr.length-1;j++)
	System.out.println(arr[j]);
	
	

}


}
