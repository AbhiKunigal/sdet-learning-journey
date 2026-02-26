package polymorphismAndEncapsulation;

public class AccountEncapsulationMain {

	public static void main(String[] args) {

		AccountEncapsulation ac=new AccountEncapsulation();
		ac.setAccountNo(98);
		int accountvalue=ac.getAccountNo();
		System.out.println(accountvalue);
		ac.setName("Abhi");
		System.out.println(ac.getName());
	}

}
