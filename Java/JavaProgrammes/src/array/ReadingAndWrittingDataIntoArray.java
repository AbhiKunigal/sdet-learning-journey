package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWrittingDataIntoArray {

	public static void main(String[] args) {
		int a[]=new int[3];
		
		Scanner sc =new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter an element of"+a[i]);
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
}
}
