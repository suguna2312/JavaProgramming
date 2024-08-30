package strings;

public class CountTargetCharacter {
	public static void main(String[] args) {
		String s="java";
		char t='a';
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch==t)
			{
				count=count+1;
			}
		}
		System.out.println(count);
	}

}
