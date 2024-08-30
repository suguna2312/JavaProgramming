package arrays;

import java.util.Scanner;

public class SecondMaximumInArray {                             

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
		int max=a[0],scmax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				scmax=max;
				max=a[i];
			}
			else if(a[i]>scmax && a[i]!=max)
			{
				scmax=a[i];
			}
		}
		System.out.println(scmax);
		

	}

}
