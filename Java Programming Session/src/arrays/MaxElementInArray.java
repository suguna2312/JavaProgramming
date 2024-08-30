package arrays;

import java.util.Scanner;

public class MaxElementInArray {
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
		
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			int word=a[i];
			if(word>max)
			{
				max=word;
			}
		}
		System.out.println(max);
		
		
	}

}
