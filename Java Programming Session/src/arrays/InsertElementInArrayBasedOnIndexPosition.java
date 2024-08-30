package arrays;

import java.util.Scanner;

public class InsertElementInArrayBasedOnIndexPosition {

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
		System.out.println("Enter the index position");
		int index=sc.nextInt();
		System.out.println("Enter the element to insert");
		int element=sc.nextInt();
		
		int b[]=new int[a.length+1];
		int temp=0;
		if(index>=0 && index<b.length)
		{
			for(int i=0;i<b.length;i++)
			{
				if(i==index)
					{
						b[i]=element;
					}
				else
					{
						b[i]=a[temp++];
					}
			}
			for(int i=0;i<b.length;i++)
			{
				System.out.println(b[i]);
			}
		}
		else
		{
			System.out.println("Enter correct index");
		}
		
		
				

	}

}
