package Patterns;

public class HallowPyramid2 {
	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||i==j||i+j==n*2)
				{
					System.out.print("* ");
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
