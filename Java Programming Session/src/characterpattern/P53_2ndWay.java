package characterpattern;

public class P53_2ndWay {
	public static void main(String[] args) {
		int n=4;
		int num=n;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=n;j++)
			{
				if(i+j>=n+1)
				{
					System.out.print(num+" ");
					
				}
				else
				{
					System.out.print("  ");
				}
			}
			num--;
			System.out.println();
		}
	}


}
