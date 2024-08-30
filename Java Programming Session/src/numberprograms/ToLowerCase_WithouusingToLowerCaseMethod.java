package numberprograms;

public class ToLowerCase_WithouusingToLowerCaseMethod {
	public static void main(String[] args) {
		String s="JAVa";
		String res="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
			int a=ch;
			char ch1=(char)(a+32);
			res=res+ch1;
		
			}
			else
			{
				res=res+ch;
			}
		}
		System.out.println(res);
	}
 
	
	
}
