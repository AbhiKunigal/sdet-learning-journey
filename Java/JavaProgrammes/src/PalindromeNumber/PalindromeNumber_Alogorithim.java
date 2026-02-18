package PalindromeNumber;

import java.util.Scanner;

public class PalindromeNumber_Alogorithim {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter a number");
	int numb=sc.nextInt();//1234
	int orginal_number=numb;
	int rev=0;
	while(numb!=0)
	{
		rev=rev*10 + numb%10; //4  
		numb=numb/10;  //123
	}
	if(rev==orginal_number)
System.out.println("Pallindome");
	else
	System.out.println("not pallindrome");
	}

}
