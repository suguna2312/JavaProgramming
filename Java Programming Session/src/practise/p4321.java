package practise;

public class p4321 {

	public static void main(String[] args) {
		int n=6;
		int num=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j<=n+1)
				{
					System.out.print(num);
					
				}
				else
				{
					System.out.print(" ");
				}
			}
			num--;
			System.out.println();
		}

	}

}
