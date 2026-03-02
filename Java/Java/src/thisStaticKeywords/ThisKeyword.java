package thisStaticKeywords;

public class ThisKeyword {
	
	
	int x,y;

	void assign(int x,int y)
	{
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
		ThisKeyword th =new ThisKeyword();
		th.assign(10, 20);

	}

}
