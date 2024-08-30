package strings;

public class StringPattern2 {
	
	public static void main(String[] args) {
		String s="java";
		for(int i=0;i<s.length();i++)
		{ 
			
			
			for(int j=0;j<s.length();j++)
			{
				char ch=s.charAt(j);
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
