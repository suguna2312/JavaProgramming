package arrays;

import java.util.Scanner;

public class ZigZagElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Array size");
		int size=sc.nextInt();
		int a []=new int[size];
		System.out.println("Enter B Array size");
		int size1=sc.nextInt();
		int b[]=new int[size1];
		System.out.println("Enter A array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter B array elements");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		int c[]=new int[a.length+b.length];
		int temp=0,temp1=0,i=0;
		while(i<c.length)
		{
			if(temp<a.length)
			{
				c[i++]=a[temp++];
				
			}
			if(temp1<b.length) 
			{
				c[i++]=b[temp1++];
				
			}
		}
		for(int j=0;j<c.length;j++)
		{
			System.out.println(c[j]);
		}
		

	}

}
