package array;

public class FindSumOFElementsInArray {

	public static void main(String[] args) {
		//a= {1,2,3,4,5}
		int a[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("Sum of array is "+sum);
		

	}

}
