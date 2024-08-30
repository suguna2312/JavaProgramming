package strings;

public class MinWord {
	public static void main(String[] args) {
		String s="Java is a Programming language";
		String s1 []=s.split(" ");
		String min=s1[0];
		for(int i=0;i<s1.length;i++)
		{
			String word=s1[i];
			if(word.length()<min.length())
			{
				min=word;
			}
		}
		
		System.out.println(min);
		
		
	}

}
