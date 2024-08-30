package strings_practise;

public class CountTargetCharacter {

	public static void main(String[] args) {
	String s="java is a pragramming language";
	char t=' ';
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch==t)
		{
			count++;
		}
	}
	System.out.println(count);
			
			

	}

}
