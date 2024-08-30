package numberprograms;

public class Palindrome {
	public static void main(String[] args) {
		int n=9,rev=0;
		int copy=n;
		while(n>0)
		{
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
			
			
		}
		//System.out.println(rev);
		if(copy==rev)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not a Palindrome number");
		}
	}

}
