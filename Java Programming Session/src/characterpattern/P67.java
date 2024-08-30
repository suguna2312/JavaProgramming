package characterpattern;

public class P67 {
	
	public static void main(String[] args) {
		int n=4;
		
		for(int i=1;i<=n;i++)
		{
			char ch='A';
			
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==1||i==n||j==n)
				{
					System.out.print(ch+" ");
					ch++;
				}
				else
				{
					System.out.print("  ");
					ch++;
				}
			}
			System.out.println();
			
		}
	}

}
