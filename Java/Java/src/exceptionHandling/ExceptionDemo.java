package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {
	//unchecked except-arthmetic exceptions
	void test() {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		try {
			System.out.println("output:" + 10 / a);
		} catch (ArithmeticException e) {
			System.out.println("Arthemict exception");
			System.out.println(e.getMessage());
		}
	}

	// array index Out bound exception

	void Ari() {
		int arr[] = new int[5];
		int test = arr.length;
		System.out.println("Enter the number between" +" "+ "[0-" + test+"]");
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		System.out.println("Enter the value to store");
		try {
			int tb = sc.nextInt();
			arr[tc] = tb;
			System.out.println(arr[tc] = tb);
		} catch (Exception e) {
			System.out.println("handling the exception");
		} finally {
			System.out.println("finall block will be executed if we get exception or not");
		}

	}
	//null pointer exceptions
	void m2()
	{
		String nl=null;
		try {
		nl.toString();
		System.out.println(nl.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Handled exception beacse nl is null");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled exception beacse nl is null");
		}
		
	}

	//checked exception
	void check() throws InterruptedException, FileNotFoundException {
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		Thread.sleep(5000);
		System.out.println(a);

		FileInputStream FL = new FileInputStream("test the ocation");

		System.out.println("Test");

	}

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		ExceptionDemo et = new ExceptionDemo();
		//		et.test();
		//		et.check();
		//et.Ari();
		et.m2();
		

	}

}
