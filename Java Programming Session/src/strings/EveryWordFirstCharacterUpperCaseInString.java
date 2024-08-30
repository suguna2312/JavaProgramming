package strings;

public class EveryWordFirstCharacterUpperCaseInString {
	public static void main(String[] args) {
		String s="jAva is fun ";
		String s1[]=s.split(" ");
		String res="";
	
		for(int i=0;i<s1.length;i++)
		{
			String word=s1[i];
			for(int j=0;j<word.length();j++)	
			{
				char ch=word.charAt(j);
				if(j==0&&ch>='a'&& ch<='z')
				{
					int a=ch;
					char ch1=(char)(a-32);
					res=res+ch1;
				}
				else if(j!=0&&ch>='A'&& ch<='Z')
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
			//System.out.println(res);
			res=res+" ";
		}
		System.out.println(res);
	}

}
