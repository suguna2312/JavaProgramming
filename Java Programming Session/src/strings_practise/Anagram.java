package strings_practise;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s="a decimal point";
		String s1="iam dotin place";
		System.out.println(s.length());
		System.out.println(s1.length());
		if(s.length()!=s1.length())
		{
			System.out.println("Not an Anagram");
		}
		else
		{
			char ch[]=s.toCharArray();
			char ch1[]=s1.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
			for(int i=0;i<ch.length;i++)
			{
				System.out.println("ch"+ch[i]);
				System.out.println("ch1"+ch1[i]);
			}
			boolean flag=false;
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]==ch1[i])
				{
					flag=true;
				}
				else
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not an Anagram");
			}
			
			
			
			
			
			
				
		}
	}

}
