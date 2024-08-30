package practise;

public class Sqrt {
	public static void main(String[] args) {
		int n=9;
		for(int i=1;i<=n;i++)
		{
			if(i*i==n)
			{
				System.out.println(i);
				break;
			}
			else if(i==n)
			{
				System.out.println("Number doesnt have Square Root");
			}
		}
	}

}
