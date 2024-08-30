package practise;

public class P4321_2ndway {

	public static void main(String[] args) {
		int n=4;
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=n;j++)
			{
				if(i>=j)
				{
					System.out.print(i+" ");
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
