package accessModifier;

 public class AccessModifier {

	private String s;
	private int it;
	
	 void test2() {
		System.out.println("test2");
	}

	static void main(String[] args) {
		

	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public int getIt() {
		return it;
	}
	public void setIt(int it) {
		this.it = it;
	}

}
