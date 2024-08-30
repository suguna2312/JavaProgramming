package arrays;

import java.util.Scanner;

public class ArrayAverage {

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
		
		
		double sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i]; 
		}
		System.out.println(sum/a.length);
		

	}

}
