package strings;

public class SumOfDigits {
	public static void main(String[] args) {
		String s="ab123";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				int a=ch;
				sum=sum+(a-48);
				
			}
		}
		System.out.println(sum);
	}

}
