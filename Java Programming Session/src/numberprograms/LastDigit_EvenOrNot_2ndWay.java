package numberprograms;

public class LastDigit_EvenOrNot_2ndWay {
	public static void main(String[] args) {
		int n=123;
		while(n>9)
		{
			n=n/10;
		}
		if(n%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}

}
