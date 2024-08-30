package strings;

public class SwapLastWordToFirstWord {
	public static void main(String[] args) {
		String s="Java is fun and also difficult";
		String s1[]=s.split(" ");
		String temp=s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=temp;
		String res="";
		for(int i=0;i<s1.length;i++)
		{
			
			res=res+s1[i]+" ";
		}
		System.out.println(res);
	}

}
