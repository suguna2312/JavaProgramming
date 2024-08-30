package strings;

public class AlternateConversion {
	public static void main(String[] args) {
		String s="aBcdefGHI123";
		String res="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(i%2==0 && (ch>='a'&&ch<='z'))
			{
				int asc=ch;
				char ch1=(char)(asc-32);
				res=res+ch1;
			}
			else if(i%2!=0 && (ch>='A'&&ch<='Z'))
			{
				int asc=ch;
				char ch1=(char)(asc+32);
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
