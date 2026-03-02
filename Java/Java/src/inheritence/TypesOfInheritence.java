package inheritence;

class parent {
	int a = 100;

	void print() {
		System.out.println(a);
	}

}

class child1 extends parent {
	int b = 200;

	void displa() {
		System.out.println(b);
	}
}

class child2 extends child1 {
	int c = 300;

	void show() {
		System.out.println(c);
	}
}
class child3 extends parent {
	int d = 300;

	void show() {
		System.out.println(d);
	}
}

public class TypesOfInheritence {

	public static void main(String[] args) {
		// Single inheritance
		child1 ch = new child1();
		System.out.println(ch.a);
		System.out.println(ch.b);
		ch.print();
		ch.print();

		// multi inheritance
		child2 ch2 = new child2();
		System.out.println(ch2.a);
		System.out.println(ch2.b);
		System.out.println(ch2.c);
		ch2.displa();
		ch2.show();

		//Hierarchy inheritance
		child3 ch3 =new child3();
		System.out.println(ch3.a);
	}

}
