package strings;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s="a decimal point";
		String s1="i am dot in place";
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
			//String s3=new String(ch);
			//String s4=new String(ch1);
			//System.out.println(s3.equals(s4));
			if(flag==true)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
			
		}
		
	}

}
