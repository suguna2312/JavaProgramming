package array2d;

import java.util.Scanner;

public class SumOfArrayElements2D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size");
		int row=sc.nextInt();
		System.out.println("Enter the col size");
		int col=sc.nextInt();
		int a [][]=new int[row][col];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int max=a[0][0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
		}
		System.out.println(max);

		}

}
