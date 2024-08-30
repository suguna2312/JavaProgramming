package numberprograms;

public class SpyNumber {
	public static void main(String[] args) {
		int n=123,sum=0,prod=1;
		while(n>0)
		{
			int d=n%10;
			sum=sum+d;
			prod=prod*d;
			n=n/10;
		}
		if(sum==prod)
		{
			System.out.println("Spy number");
		}
		else
		{
			System.out.println("Not a Spy number");
		}
	}

}
