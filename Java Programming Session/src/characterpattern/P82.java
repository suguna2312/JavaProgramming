package characterpattern;

public class P82 {
	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=n*2-1;i++)
		{
			char ch='A';
			for(int j=1;j<=n;j++)
			{
				if(i+j>=n+1 && i-j<=n-1)
				{
					System.out.print(ch+" ");
					ch++;
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
