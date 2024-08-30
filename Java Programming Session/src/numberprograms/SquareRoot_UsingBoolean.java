package numberprograms;

public class SquareRoot_UsingBoolean {
	public static void main(String[] args) {
		boolean flag=true;
		int n=9;
		for(int i=1;i<=n;i++)
		{
			if(i*i==n)
			{
				flag=false;
				System.out.println(i);
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Number doesnt have square root");
		}
	}

}
