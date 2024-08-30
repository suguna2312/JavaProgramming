package strings;

public class StringPattern {
	public static void main(String[] args) {
		String s="java";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			for(int j=0;j<s.length();j++)
			{
				if(i>=j)
				{
					System.out.print(ch+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
