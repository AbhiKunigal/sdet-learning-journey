package inheritence;

class Parent2 {
	void num1(int a) {
		System.out.println(a);
	}

	void num2(int b) {
		System.out.println(b);
	}
}

class childr extends Parent2 {
	// method overloading
	void num1(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}

	// method overriding
	void num2(int b) {
		System.out.println(b * b);
	}

}

public class OverLoadingVSOverRiding {

	public static void main(String[] args) {
		childr d = new childr();
		d.num1(100);
		d.num2(2);
		d.num1(10, 20);
	}

}
