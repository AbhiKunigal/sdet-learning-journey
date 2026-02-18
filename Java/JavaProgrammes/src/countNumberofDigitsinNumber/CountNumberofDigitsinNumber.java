package countNumberofDigitsinNumber;

import java.util.Scanner;

public class CountNumberofDigitsinNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number");
		int numb=sc.nextInt();
	int rev=0;
	int count = 0;
		while(numb!=0)
		{
		numb=	numb/10;
		count++;
		}
		System.out.println(count);

	}

}
