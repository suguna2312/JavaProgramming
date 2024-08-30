package strings_practise;

public class LowerToUpper {
	public static void main(String[] args) {
		String s="jaVA";
		String res="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z')
			{
				int asc=ch;
				char ch1=(char)(asc-32);
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
