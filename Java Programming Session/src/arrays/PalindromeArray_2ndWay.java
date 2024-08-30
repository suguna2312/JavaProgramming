package arrays;

import java.util.Scanner;

public class PalindromeArray_2ndWay {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of A array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter A array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int b[]=new int[a.length];
		int temp=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[temp++]=a[i];
		}
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Array is Palindrome");
		}
		else
		{
			System.out.println("Array is not Palindrome");
		}
	}

}
