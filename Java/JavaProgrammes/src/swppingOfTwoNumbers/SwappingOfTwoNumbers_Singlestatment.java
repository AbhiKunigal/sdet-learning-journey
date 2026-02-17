package swppingOfTwoNumbers;

public class SwappingOfTwoNumbers_Singlestatment {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Before Swapping a="+a+" b="+b);
		b=a+b-(a=b);
		System.out.println("After Swapping a="+a+" b="+b);
	}

}
