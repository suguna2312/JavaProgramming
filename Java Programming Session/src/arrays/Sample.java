package arrays;

import java.util.Arrays;
import java.util.TreeSet;

public class Sample {

	public static void main(String[] args) {
		
		 String [] a= {"Rs 17,899","Rs 25,499","Rs 3,299"}; 
		 String res="";
		 for(int i=0;i<a.length;i++)
		 {
			String word=a[i];
			 for(int j=0;j<word.length();j++)
			 {
				 char ch=word.charAt(j);
				// System.out.println(ch);
				 
				 if(ch>='0' && ch<='9')
				 {
					 res=res+ch;
					 //System.out.println(res);
				 }
			 }
			 res=res+" ";
			// System.out.println(res);
			 }
		 		
		 String[] b=res.split(" ");
		 
		 int arr[]=new int[3];
		 for(int i=0;i<arr.length;i++) {
		         arr[i] = Integer.parseInt(b[i]);
		 }
		 //printing array elements with integer type
		 /*for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }*/
		 
		// Arrays.sort(b);
			
			 /*for(int i=0;i<b.length;i++) 
			 { 
			 System.out.println(b[i]); 
			 } */
			// b.toString();
			 
		// Integer.valueOf(b[0]);
		 //Integer.valueOf(b[1]);
		// Integer.valueOf(b[2]);
		 //TreeSet<Integer> t=new TreeSet();
		 
			
		// System.out.println(t);
		 
		 
		 
		 TreeSet<Integer> t=new TreeSet();
		 for(Integer i:arr) {
			t.add(i);
		 }
		 System.out.println(t);
		/* Arrays.sort(a); 
		 for(String a1:a) 
		 { 
			 System.out.println(a1); 
			 }
		 
		TreeSet t=new TreeSet();
		t.add(17,899);
		t.add(25,499);
		t.add(3,299);
		
		//System.out.println(t);
		for(Object obj:t)
		{
			System.out.println(obj);
		}
		*/
		

	}

}
