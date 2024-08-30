package strings;

public class NumAlpha {

	public static void main(String[] args) {
		String s="AaBb2Cc";
		int uc=0,lc=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				lc++;
			}
			else if(ch>='A'&&ch<='Z')
			{
				uc++;
			}
		}
		System.out.println(lc);
		System.out.println(uc);
	}
}
