package conditionalProgrammes;

public class LargesOfThreeNumbers {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		if(a>b && a>c)
		{
			System.out.println("A is largest");
		}
		else if (b>a && b>c)
		{
			System.out.println("b is largest");
		}
		else
		{
			System.out.println("c is largest");
		}
	}

}
