package strings;

public class CountWordOccurences {

	public static void main(String[] args) {
		String s="Hi Hii Hi Hello Bye Bye Qspiders OAR Hi Hello Bye Bye"
				+ "";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			String word=s1[i];
			int count=1;
			for(int j=i+1;j<s1.length;j++)
			{
				String word1=s1[j];
				if(word.equals(word1))
				{
					count++;
					s1[j]="@";
					
				}
			}
			if(count>=1&&s1[i]!="@")
			{
				System.out.println(word+" "+count);
			}
			
		}

	}

}
