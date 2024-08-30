package arrays;

import java.util.Scanner;

public class RemoveArrayElementBasedOnIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an A array");
		int size=sc.nextInt();
		int a[] =new int[size];
		System.out.println("Enter Array elements");
		for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
		System.out.println("enter the index value to remove element");
		int index=sc.nextInt();
		int temp=0;
		int b[]=new int[a.length-1];
		if(index>=0 && index<a.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(i!=index)
				{
					b[temp++]=a[i];
					//System.out.println(a[i]);
					//System.out.println(b[i]);
				}
			}
			for(int i=0;i<b.length;i++)
			{
				System.out.println(b[i]);
			}
		}
		else
		{
			System.out.println("enter correct index");
		}
		

	}
}
