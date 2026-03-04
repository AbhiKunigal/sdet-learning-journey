package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList arl = new ArrayList();

		// adding to arraylist
		arl.add(100);
		arl.add("Ridhika");
		arl.add("Riya");
		arl.add('c');
		arl.add(null);
		arl.add(100);

		//find the size of arr
		System.out.println(arl.size());
		
		// printing the object items
		System.out.println(arl);

		// get the specific value
		System.out.println("Get the specific value " + arl.get(1));

		// inserting items
		arl.add(0, 200);
		System.out.println(arl);
		
		//replace/change the vaule
		arl.set(0, 300);

		// removing the value
		arl.remove(1);
		System.out.println(arl);

		// removing the multiple values
		ArrayList remo = new ArrayList();
		remo.add(200);
		remo.add('c');
		System.out.println(remo);
		arl.removeAll(remo);
		System.out.println("removing the specific" + arl);

		// reading the values using for loop
		System.out.println("Printing all the values using for loop-");
		for (int i = 0; i < arl.size(); i++) {

			System.out.println(arl.get(i));
		}

		// reading all the values using for each/enhanced loop
		System.out.println("Printing all the values using for for each loop-");
		for (Object x : arl) {
			System.out.println(x);
		}

		// reading the values using iterator
		System.out.println("Printing all the values using iterator");
		Iterator it = arl.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
			
			
		}
		//remove all the values of array
		arl.clear();
		System.out.println(arl);

	}

}
