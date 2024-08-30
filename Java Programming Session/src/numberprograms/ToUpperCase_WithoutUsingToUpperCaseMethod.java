package numberprograms;

public class ToUpperCase_WithoutUsingToUpperCaseMethod {
	public static void main(String[] args) {
		String s="jAva";
		String res="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z')
			{
			int a=ch;
			char ch1=(char)(a-32);
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
