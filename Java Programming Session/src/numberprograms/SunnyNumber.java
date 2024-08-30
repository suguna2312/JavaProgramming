package numberprograms;

public class SunnyNumber {
	public static void main(String[] args) {
		boolean flag=false;
		int n=16;
		int n1=n+1;
		for(int i=1;i<=n1;i++)
		{
			
			if(i*i==n1)
			{
				flag=true;
				System.out.println("Sunny number");
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Not a Sunny number");
		}
	}
	

}
