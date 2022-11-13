package com.test;

import java.util.HashSet;
import java.util.Set;

public class LongestStringWithoutRepeatingWord {
	
	public static int LongestString(String s) {
		                                          // abcabcaadg
		
		int i=0;
		int j=0;
		int maxlength=0;
		
		Set<Character> st= new HashSet<Character>();
		
		while(i<s.length() && j<s.length()) {
			
			if(!st.contains(s.charAt(j))) {
				st.add(s.charAt(j));
				j++;
				maxlength=Math.max(maxlength, j-i);
					
			}
			else {
				st.remove(s.charAt(i));
				i++;
			}
			
		}
		for(Character ch:st) {
			System.out.print(ch);
		}
		return maxlength;
		
	}
	
	public static void main (String args[]) {
	int max	=LongestString("abcabcaabbd");
	System.out.println("maxlength:"+max);
	System.out.println("Thank you");	
	}

}
