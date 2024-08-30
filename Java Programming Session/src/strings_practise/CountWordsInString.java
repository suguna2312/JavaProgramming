package strings_practise;

public class CountWordsInString {
	public static void main(String[] args) {
		String s="  java  is  fun ";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if((i==0 && s.charAt(i)!=' ') || 
					(s.charAt(i)!=' ' && s.charAt(i-1)==' '))
				{
					count++;
				}
		}
		System.out.println(count);
	}

}
