package strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {

	//public static void main(String[] args)
	public void string123()
	{
		// TODO Auto-generated method stub
		String st ="Hello";
		 //finding length of String
		System.out.println(st.length());//Length
		
		//concat
		String s1="Hello";
		String s2="World";
		System.out.println(s1.concat(s2));
		
		//triming-remove spaces let and right side
		String s3="  trim  ";
		System.out.println("Before triming"+s3.length());//Length
		System.out.println("After Trimming"+s3.trim().length());//trim
		
		//charAt()-returns a charter from a string based on index
		String s4="Ridhika";
		System.out.println(s4.charAt(0));
		
		//contains
		System.out.println(s4.contains("Ridhi"));//Returns boolean
		
		//equals
		System.out.println(s4.equals("ridhika"));
		System.out.println(s4.equalsIgnoreCase("ridhika"));
		
		//replace a character/sequence of charter in string
		String s5="good day today";
		System.out.println(s5.replace('g', 'G'));//just char
		System.out.println(s5.replace("today","everyday"));
		
		//substring - extract the portion of string
		
	   System.out.println(s5.substring(0, 4));//end index is always +1
	   
	   //converting the case
	   System.out.println(s5.toLowerCase());
	   System.out.println(s5.toUpperCase());
	   
	   //split()--split the string into multiple parts using delimiter
	   String s6="abhi@google.com";
	  String a[]=  s6.split("@");
	  System.out.println(a[0]);
	  System.out.println(Arrays.toString(a));
	  
	  //*,%,^,& () cannot use this delimiter
	  
	  //replace method
	  String s7="$20,25,30";
	  String s8=s7.replace("$", "").replace(",", "");
	  System.out.println(s8);
	}
}