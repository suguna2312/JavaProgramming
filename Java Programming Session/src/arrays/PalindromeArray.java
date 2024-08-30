package arrays;

import java.util.Scanner;

public class PalindromeArray {
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
	int temp=0,temp1=a.length-1;
	boolean flag=false;
	while(temp<temp1)
	{
		if(a[temp]==a[temp1])
		{
			flag=true;
			temp++;
			temp1--;
			
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
		System.out.println("Array is Not Palindrome");
	}
}
}
