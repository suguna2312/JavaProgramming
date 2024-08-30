package numberprograms;

public class LastDigit_EvenOrNot {
	public static void main(String[] args) {
		int d=0;
		int n=423;
		while(n>0)
		{
			
			 d=n%10;
			n=n/10;
			
		}
		
		
		if(d%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}

}
