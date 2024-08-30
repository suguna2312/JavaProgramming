package strings;

public class AlphabetsNumbers {
	public static void main(String[] args) {
		String s="a1b2c3G4";
		String alpha="";
		String num="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
			{
				alpha=alpha+ch;
			}
			else if(ch>='0'&&ch<='9')
			{
				num=num+ch;
			}
		}
		System.out.println(alpha+num);
	}

}
