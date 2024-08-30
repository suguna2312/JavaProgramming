package strings;

public class LastWordReverse {
	public static void main(String[] args) {
		String s="Java is fun";
		String s1[]=s.split(" ");
		String word=s1[s1.length-1];
		String rev="";
		for(int i=word.length()-1;i>=0;i--)
		{
			char ch=word.charAt(i);
			rev=rev+ch;
		}
		s1[s1.length-1]=rev;
		String res="";
		for(int i=0;i<s1.length;i++)
		{
			res=res+s1[i]+" ";
		}
		System.out.println(res);
	}

}
