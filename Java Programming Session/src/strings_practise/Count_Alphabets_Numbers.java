package strings_practise;

public class Count_Alphabets_Numbers {

	public static void main(String[] args) {
	String s="A1b23c45";
	int alpha=0,num=0;
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z')
		{
			alpha++;
		}
		else if(ch>='0'&&ch<='9')
		{
			num++;
		}
	}
	System.out.println(alpha);
	System.out.println(num);

	}

}
