package characterpattern;

public class P49_2ndWay {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++)
		{
			int num=n;
			for(int j=1;j<=n;j++)
			{
				if(i>=j)
				{
					System.out.print(num+" ");
					num--;
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
