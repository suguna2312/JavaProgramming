package strings;

public class ReverseEntireWordsInString {
	public static void main(String[] args) {
		String s="Java is fun";
		String s1[]=s.split(" ");
		String res="";
		for(int i=0;i<s1.length;i++)
		{
			String word=s1[i];
			String rev="";
			for(int j=word.length()-1;j>=0;j--)
			{
				char ch1= word.charAt(j);
				rev=rev+ch1;
			}
			
			res=res+rev+" ";
			
		}
		System.out.println(res);
	}

}
