package arrays;

import java.util.Scanner;

public class DistinctValuesInArray {
public static void main(String[] args) {
	//int max=Integer.MAX_VALUE;
	//System.out.println(Integer.MAX_VALUE);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an A array");
	int size=sc.nextInt();
	int a[] =new int[size];
	System.out.println("Enter Array elements");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	} 
	for(int i=0;i<a.length;i++)
	{
		int count=0;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count++;
				a[j]=-1; //max
						//Integer.MAX_VALUE;
			}
		}
		if(count==0 && a[i]!=-1)//max or Integer.MAX_VALUE;
		{
			System.out.println(a[i]);
		}
	}
}
}
