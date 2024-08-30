package numberprograms;

public class PrimeNumber_InbtwRange {
	public static void main(String[] args) {
		int s=1;
		int e=7;
		for(int i=s;i<=e;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}

}
