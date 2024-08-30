package arrays;

import java.util.Scanner;

public class DynamicArray {

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
	System.out.println("Printing Array Elements");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
		

	}

}
