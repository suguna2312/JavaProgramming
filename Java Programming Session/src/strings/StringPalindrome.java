package strings;

public class StringPalindrome {
	public static void main(String[] args) {
		String s="MADAM";
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch= s.charAt(i);
			res=res+ch;
		}
		if(s.equals(res))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
	}

}
