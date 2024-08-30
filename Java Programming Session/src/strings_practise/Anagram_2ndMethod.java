package strings_practise;

public class Anagram_2ndMethod {

	public static void main(String[] args) {
		String s="topt";
		String s1="pttt";
		int temp=s.length()-1,temp1=0;
		boolean flag=false;
		if(s.length()!=s1.length())
		{
			System.out.println("Not a Anagram");
		}
		else
		{
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(temp)==s1.charAt(temp1))
				{
					flag=true;
					temp--;
					temp1++;
				
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
				System.out.println("Not a Anagram");
			}
		}

	}

}
