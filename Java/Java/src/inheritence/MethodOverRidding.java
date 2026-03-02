package inheritence;
class parent1
{
	int a=100;
	void test()
	{
		System.out.println("This is parent");
	}
	}

class child extends parent1
{
	int a=200;
	void test()
	{
		System.out.println("This is child-overloading");
	}}

public class MethodOverRidding {

	public static void main(String[] args) {
		parent1 p=new parent1();
		System.out.println(p.a);
		p.test();
		
		//overriiding
		child ch=new child();
		System.out.println(ch.a);
		ch.test();
	}

}
