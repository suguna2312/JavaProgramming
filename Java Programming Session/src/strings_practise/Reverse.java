package strings_practise;

public class Reverse {

	public static void main(String[] args) {
		String s="Dolly";
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			res=res+ch;
		}
		System.out.println(res);

	}

}
