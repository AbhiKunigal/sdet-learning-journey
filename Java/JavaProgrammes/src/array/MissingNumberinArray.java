package array;

public class MissingNumberinArray {

	public static void main(String[] args) {
		// Array should not have duplicates
		//Array should be in arrange
		//Array no need to be sorted
		
		int a[]= {1,2,4,5};
		int sum1=0;
		int sum2=0;
		for(int x:a)
		{
			sum1=sum1+x;
		}
		System.out.println("Sum of an given array"+sum1);
		
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of an missing array"+sum2);
		
		System.out.println("missing number"+(sum2-sum1));

	}

}
