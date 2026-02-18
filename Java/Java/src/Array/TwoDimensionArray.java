package Array;

public class TwoDimensionArray {

	public static void main(String[] args) {
		//Declare array--Approach1
		int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		
		//Apprach-2
		int b[][]= {{100,200},
					{300,400},
					{500,600}};
		//REading length of rows and columns
		System.out.println("length of rows "+ a.length);
		System.out.println("length of columns "+ a[0].length);
		// read single value from array
		System.out.println(b[0][0]);
		// read all the value from array
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("reading all the values "+a[i][j]);
			}
		}
		//using enhnced for loop
		for(int arr[]:b)
		{
			for(int x:arr){
				System.out.println(x);
			}
		}
	}

}
