package arrays;

import java.util.Scanner;

public class ArrayPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int size=sc.nextInt();//sc.next().charAt(0);
		int a []=new int[size];
		System.out.println("Enter the array elements");
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				flag=true;
				System.out.println(a[i]);
				
			}
			
		}
		if(flag==false)
		{
			System.out.println("No Prime numbers");
		}
			

	}

}
