package strings_practise;

public class CountTargetWordInSentence {

	public static void main(String[] args) {
	String s="Hi Hii hello he Hi HI Hi Hi Hii hello he Hi HI Hi";
	String s1[]=s.split(" ");
	String t="Hi";
	int count=0;
	for(int i=0;i<s1.length;i++)
	{
		String ch=s1[i];
		if(ch.equals(t))
		{
			count++;
		}
	}
	System.out.println(count);

	}

}
