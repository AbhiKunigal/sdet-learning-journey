package array;

public class FindANumberOfRepetationInArray {

	public static void main(String[] args) {
		int a[]= {100,200,100,300,400,100,100};
		int element=100;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
			{
				count++;
				
			}
		}
		System.out.println(count);

	}

}
