package arrays;

import java.util.Scanner;

public class Copying1ArrayToAnotherArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size");
		int size = sc.nextInt();// sc.next().charAt(0);
		int a[] = new int[size];
		int b[] = new int[a.length];
		System.out.println("Enter the array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		for (int i = 0; i < b.length; i++) {

			b[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
