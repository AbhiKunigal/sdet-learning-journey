package Array;

public class ArrayDemo {

	public static void main(String[] args) {
		// Declaring the array
		// Approach 1
		/*
		 * int a[] = new int[3]; a[0]=10; a[1]=20; a[2]=30;
		 */

		// Approach 2
		int a[] = { 10, 20, 30 };
		// find the length of array
		System.out.println(a.length);

		// read single value from array
		System.out.println(a[0]);
		// read all the values from array
		for (int i = 0; i < a.length; i++) {
			System.out.println("Reading all the values" + a[i]);
		}
		
		//Enhanced for loop
		for(int x :a)
		{
			System.out.println("Reading all the values using enhanced loop" + x);
		}
	}
}
