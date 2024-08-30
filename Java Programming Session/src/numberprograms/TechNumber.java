package numberprograms;

public class TechNumber {
	public static void main(String[] args) {
		int n=2025;
		int copy=n;
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		if(count%2==0)
		{
			int temp=count/2;
			while(temp>0)
			{
				int a=n%10;
				
			}
			
		}
		else
		{
			System.out.println("Not Tech Number");
		}
	}

}
