package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the target value");
		int t=sc.nextInt();
		Arrays.sort(a);
		System.out.println(a);
		int l=0,h=a.length-1;
		int mid=0;
		boolean flag=false;
		while(l<=h)
		{
			mid=(l+h)/2;
			if(t==a[mid])
			{
				flag=true;
				System.out.println("Target is Present");
				break;
			}
			else if(t>a[mid])
			{
				l=mid+1;
			}
			else if(t<a[mid])
			{
				h=mid-1;
			}
			
		}
		if(flag==false)
		{
			System.out.println("Element not present in the given array");
		}
	
	}

}
