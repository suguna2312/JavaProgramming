package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArray {
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
			int temp=a[0];
			for(int j=1;j<a.length;j++)
			{
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
		}
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	
	}


}
