package array;

import java.util.Arrays;

public class SortingAarrayUsingBubbleSort_Forloop {

	public static void main(String[] args) {
		int a[]= {3,1,4,2};
		int n=a.length;
		for(int i=0;i<n-1;i++)//number of passes
		{
			for(int j=0;j<n-1;j++)//number of iterations
			{
				if(a[j]>a[j+1])//For descending order a[j]<a[j+1]
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
				
			}
		}
System.out.println(Arrays.toString(a));
	}

}
