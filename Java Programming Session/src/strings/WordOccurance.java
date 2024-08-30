package strings;

public class WordOccurance {
public static void main(String[] args) {
	String s="Hi HI Hi hi Hello Hi Hi";
	String s1[]=s.split(" ");
	String t="Hi";
	int count=0;
	for(int i=0;i<s1.length;i++)
	{
		String ch=s1[i];
		if(ch.equals(t))
		{
			count=count+1;
		}
	}
	System.out.println(count);
}
}
