package strings;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		String s="JavaProgramming";
		System.out.println(s.length());//15
		System.out.println(s.charAt(4));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		String a="JavaProgramming";
		String b="javaProgramming";
		System.out.println(a.equals(s));
		System.out.println(s.equals(b));
		System.out.println(s.equalsIgnoreCase(b));
		char ch []=s.toCharArray();
		System.out.println(ch);
		String c="java programming is very easy";
		String sa []=c.split(" ");
		//System.out.println(sa[1]);
		for(int i=0;i<=sa.length-1;i++)
		{
			System.out.println(sa[i]);
		}
		System.out.println(s.indexOf('m'));
		
	}

}
