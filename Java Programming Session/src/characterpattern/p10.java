package characterpattern;

public class p10 {
	public static void main(String[] args) {
		int n=3;
		char ch='A';
		
		for(int i=1;i<=n;i++)
		{
			char ch1=ch;
			int a=ch;
			for(int j=1;j<=n;j++)
			{
				
					System.out.print(ch1+" ");
					a=a+n;
					ch1=(char) a;
				
			}
			System.out.println();
			ch++;
			
		}
		
	}

}
