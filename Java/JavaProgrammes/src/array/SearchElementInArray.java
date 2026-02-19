package array;

public class SearchElementInArray {

	public static void main(String[] args) {
		int a[]= {100,200,300,400,500,200};
		boolean status=false;
		int element=200;
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
			{
				System.out.println("we have match");
				status=true;
				break;
			}
				
		}*/
		
		//enhanced for loop
		for(int x:a)
		{
			if(x==element)
			{
				System.out.println("we have match");
				status=true;
				break;
			}
		}
		if(status==false)
		System.out.println("we dont have match");
	}

}
