package strings;

public class CountNoOfWordsInString {
	public static void main(String[] args) {
		String s="java  is   fun  ";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if((i==0&&s.charAt(i)!=' ')||
					(s.charAt(i)!=' '&& s.charAt(i-1)==' '))
			{
				count++;
			}
		}
		System.out.println(count); 
		
		
		
		
		
		
		/*String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
		System.out.println(s1.length);*/
		
			
		
		
	}

}
