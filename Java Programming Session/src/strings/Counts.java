package strings;

public class Counts {
	public static void main(String[] args) {
		String s="Java@123";
		String s1=s.toLowerCase();
		System.out.println(s1);
		int vc=0;
		int cc=0;
		int sc=0;
		int nc=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
			{
				if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'
					||ch=='o'||ch=='O'||ch=='u'||ch=='U')
				{
					vc++;
				}
				else 
				{
					cc++;
				}
			}
			else if(ch>='0'&&ch<='9')
			{
				nc++;
			}
			else
			{
				sc++;
			}
		}
		System.out.println("vowels="+vc);
		System.out.println("consonants="+cc);
		System.out.println("Numbers="+nc);
		System.out.println("Special Characters="+sc);
	}

}
