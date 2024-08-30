package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMinimumInArray_3rdway {

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
	
		
		int min=Integer.MAX_VALUE,scmin=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				scmin=min;
				
				min=a[i];
			}
			else if(a[i]<scmin && a[i]!=min)
			{
				scmin=a[i];
			}
		}
		System.out.println(scmin);
		

	}

}
