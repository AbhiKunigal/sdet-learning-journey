package countNumberofDigitsinNumber;

import java.util.Scanner;

public class CountEvenAndODDNumbers {

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("ENternumber");
int numb=sc.nextInt();
int evencount =0;
int oddcount =0;
while(numb!=0)
{
	if(numb%2==0)
	{
		evencount++;	
	}
	else
	{
		oddcount++;
	}
	numb=numb/10;	
}
System.out.println(evencount);
System.out.println(oddcount);

}

}
