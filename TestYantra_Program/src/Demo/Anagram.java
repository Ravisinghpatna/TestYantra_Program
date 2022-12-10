package Demo;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "race";
		String s2 = "care";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		if(s1.length()==s2.length())
		{
			Arrays.sort(ch1); //acer
			Arrays.sort(ch2); //acer
			
			boolean result = Arrays.equals(ch1, ch2);
			
			if(result)
			{
				System.out.println(s1+ " "+s2 +" Anagram");
			}
			else
			{
				System.out.println(s1+" "+s2+" Not Anagra");
			}
		}
		
		
		

	}

}
