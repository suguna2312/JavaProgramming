package arrays;

import java.util.Scanner;

public class RotateArrayRightSide {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int size=sc.nextInt();//sc.next().charAt(0);
		int a []=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the target to rotate");
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
			int temp=a[a.length-1];
			for(int j=a.length-2;j>=0;j--)
			{
				a[j+1]=a[j];
			}
			a[0]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	
	}


}
