package arrays;

import java.util.Scanner;

public class FindElementUsingUsingLinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int size=sc.nextInt();
		int a []=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the target value");
		int t=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==t)
			{
				flag=true;
				System.out.println("The number is present");
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("The number not found in the array");
		}

	}

}
