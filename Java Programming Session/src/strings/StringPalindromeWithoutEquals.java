package strings;

public class StringPalindromeWithoutEquals {
	public static void main(String[] args) {
		String s="MADAM";
		int temp=0,temp1=s.length()-1;
		boolean flag=false;
		while(temp<temp1)
		{
			if(s.charAt(temp)==s.charAt(temp1))
			{
				flag=true;
				temp++;
				temp1--;
				
			}
			
			else
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is Not Palindrome");
		}
		
	}

}
