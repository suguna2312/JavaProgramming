package arrays;

import java.util.Scanner;

public class Max2ndElement {
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
		int max=a[0];
		int secmax=a[a.length-1];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=max) {
				if(a[i]>secmax) {
					secmax=a[i];
				}
			}
		}
		System.out.println(secmax);
	}

}
