package characterpattern;

public class P56 {
	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i>=j&&i+j<=n*2)
				{
					System.out.print(j+" ");
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
