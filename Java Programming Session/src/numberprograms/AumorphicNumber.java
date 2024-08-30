package numberprograms;

public class AumorphicNumber {
	public static void main(String[] args) {
		int n=7;
		int sq=n*n;
		while(n>0)
		{
			int d=n%10;
			int d1=sq%10;
			if(d==d1)
			{
				n=n/10;
				sq=sq/10;
				
			}
			else
			{
				break;
			}
		}
		if(n==0)
		{
			System.out.println("Automarphic");
		}
		else
		{
			System.out.println("Not Automarphic");
		}
	}

}
