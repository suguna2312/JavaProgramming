package numberprograms;

public class Conversions {
	public static void main(String[] args) {
		//from int to char
		int a=65;
		char ch=(char)a;
		System.out.println(ch);
		
		//from char to int
		char c='A';
		int a1=c;
		
		System.out.println(a1);
		
		//from char to int
		char ca='A';
		int b=Character.getNumericValue(ca);
		System.out.println(b);
		
		//fetching ascii value based on index
		String s="suguna";
		int a2=s.codePointAt(1);
		System.out.println(a2);
		
		//integer to string
		int n=1234;
		String s1=Integer.toString(n);
		System.out.println(s1);
		System.out.println(s1.length());
		
		
		//String to integer
		
		String u="123";
		int u1=Integer.parseInt(u);
		System.out.println(u1);
		
		
		String y="suguna";
		StringBuilder s3=new StringBuilder(y);
		System.out.println(s3.reverse());
		System.out.println(s3.append("girl"));
		System.out.println(s3);
		String s4=s3.toString();
		System.out.println(s4);
		
		
		
		String t="hello";
		System.out.println(t.concat("world"));
		t="hii";
		System.out.println(t);
		
		String h="lives";
		char[] h1=h.toCharArray();
		System.out.println(h1.length);
		int i;
		char temp;
		for(i=0;i<h1.length;i++) {
			for(int j=i+1;j<h1.length;j++) {
				if(h1[i]>h1[j]) {
					temp=h1[i];
					h1[i]=h1[j];
					h1[j]=temp;
				}
			}
		}
		for(i=0;i<h1.length;i++) {
			System.out.println(h1[i]);
		}
		
	}

}
