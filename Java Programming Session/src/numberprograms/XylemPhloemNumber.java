package numberprograms;

public class XylemPhloemNumber {
	public static void main(String[] args) {
		int n=1234;
		int l=n%10;
		n=n/10;
		int is=0;
		while(n>9)
		{
			int d=n%10;
			is =is+d;
			n=n/10;
			}
		int os=l+n;
		if(is==os)
		{
			System.out.println("Xylem Number");
		}
		else
		{
			System.out.println("Phleom Number");
		}
		
	}

}
