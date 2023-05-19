package anagramproject;

import java.util.Arrays;

 

public class AnagramProgram {

	public static void main(String[] args) {
	 String s1="heart";
	 String s2="earth";
	 char[] ch1  =s1.toCharArray();
	 char[] ch2=s2.toCharArray();
 Arrays.sort(ch1);
	 Arrays.sort(ch2);
Boolean	result =Arrays.equals(ch1,ch2);
if(result==true) {
	System.out.println("given string is anagram");
}
else {
	System.out.println("given string is not anagram");
}

	 
	}

}
