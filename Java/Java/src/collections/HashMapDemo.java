package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapDemo {

	public static void main(String[] args) {
		char choice;
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		do {
			System.out.println("Enter the key value");
			int Key = sc.nextInt();
			System.out.println("Enter the corresponding value");
			String value = sc.next();
			System.out.println("do you wish to continue");
			hm.put(Key, value);
			choice = sc.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');

		// length
		System.out.println(hm.size());

		// find the ket, value and key and value
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());

		// get the perticular value
		System.out.println("get the perticular value using key -" + " " + hm.get(1));

		// replace the value
		System.out.println(hm.replace(1, "Dadamma"));
		System.out.println(hm);

		// read all the values
		System.out.println("'for each loop");
		for (Object x : hm.keySet()) {
			System.out.println(x + " " + hm.get(x));

			// readd all the values by iterator

		}
		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, String> et = it.next();
			System.out.println(et.getKey() + " " + et.getValue());
		}
	}

}
