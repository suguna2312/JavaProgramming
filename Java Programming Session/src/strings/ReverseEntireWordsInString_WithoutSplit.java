package strings;

public class ReverseEntireWordsInString_WithoutSplit {
public static void main(String[] args) {
	String s="Java is fun";
	s=s+" ";
	String word="";
	String res="";
	for(int i=0;i<s.length();i++)
	{
		//System.out.println(i);
		String rev="";
		char ch=s.charAt(i);
		//System.out.println(ch);
		if(ch!=' ')
		{
			word=word+ch;
			//System.out.println(word);
		}
		else
		{
			for(int j=word.length()-1;j>=0;j--)
			{
				char ch1=word.charAt(j);
				rev=rev+ch1;
			}
			res=res+rev+" ";
			word="";
		}
		
	}
	System.out.println(res);
}
}
