package string;

import java.util.Scanner;

public class ContWordsInString {

	public static void main(String[] args) {
		System.out.println("Enter the input string");
		Scanner sc= new Scanner(System.in);
		String st=sc.nextLine();
		int count=1;
		
		for(int i=0;i<st.length()-1;i++)
		{
			if((st.charAt(i)==' ') &&( st.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		//Approach-2
		String a[]=st.trim().split("\\s+");
		int length=a.length;
		System.out.println(length);
		
		

	}

}
