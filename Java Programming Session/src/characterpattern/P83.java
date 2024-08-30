package characterpattern;

public class P83 {

	public static void main(String[] args) {
		int n=3;
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			char ch1=ch;
			
			
			for(int j=1;j<=n;j++)
			{
				System.out.print(ch1+" ");
				int a=ch1;
				ch1=(char)(a+n);
				 
				
			}
			System.out.println();
			ch++;
		}

	}

}
