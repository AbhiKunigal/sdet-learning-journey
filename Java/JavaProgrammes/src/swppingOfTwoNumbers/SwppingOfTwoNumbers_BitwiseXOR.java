package swppingOfTwoNumbers;

public class SwppingOfTwoNumbers_BitwiseXOR {

	public static void main(String[] args) {
		
		//
		int a=10,b=20;
		System.out.println("Before Swapping a="+a+" b="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping a="+a+" b="+b);
	
		/*
		 * XOR rules:
		 * 0 ^ 0 = 0
		 * 1 ^ 1 = 0
		 * 0 ^ 1 = 1
		 * 1 ^ 0 = 1
		 *
		 * Binary (1010) Explanation for XOR Swapping
		 *
		 * Let:
		 * a = 10
		 * b = 20
		 *
		 * Binary Representation:
		 * 10  = 01010
		 * 20  = 10100
		 *
		 * Step 1: a = a ^ b
		 *
		 *   01010   (10)
		 * ^ 10100   (20)
		 * --------
		 *   11110   (30)
		 *
		 * Now:
		 * a = 30 (11110)
		 * b = 20 (10100)
		 *
		 * Step 2: b = a ^ b
		 *
		 *   11110   (30)
		 * ^ 10100   (20)
		 * --------
		 *   01010   (10)
		 *
		 * Now:
		 * a = 30 (11110)
		 * b = 10 (01010)
		 *
		 * Step 3: a = a ^ b
		 *
		 *   11110   (30)
		 * ^ 01010   (10)
		 * --------
		 *   10100   (20)
		 *
		 * Final Values:
		 * a = 20
		 * b = 10
		
		 */
	}

}
