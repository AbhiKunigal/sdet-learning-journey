package array;

public class OddEvenInArray {

	public static void main(String[] args) {
		//a={1,2,3,4,5}
		int a[]= {1,2,3,4,5};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even numbers are "+a[i]);
			}
			else {
				System.out.println("odd numbers are"+a[i]);
			}
		}

	}

}
