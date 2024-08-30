package strings_practise;

public class ReverseAllWords {
	public static void main(String[] args) {
		String s="java is fun";
		String s1[]=s.split(" ");
		String res="";
		for(int i=0;i<s1.length;i++)
		{
			String word=s1[i];
			String rev="";
			for(int j=word.length()-1;j>=0;j--)
			{
				char ch=word.charAt(j);
				rev=rev+ch;
			}
			res=res+rev+" ";
			
		}
		System.out.println(res);
		
	}

}
