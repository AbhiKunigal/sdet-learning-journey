package ReverseANumber;

import java.util.Scanner;

public class ReverseANumber_StringBuffer {

	public static void main(String[] args) {
Scanner nb=new Scanner(System.in)	;
System.out.println("Enter Nmber");
int numb= nb.nextInt();
		StringBuffer sc = new StringBuffer(String.valueOf(numb));
		StringBuffer rev= sc.reverse();
		
		System.out.println(rev);
		

	}

}
