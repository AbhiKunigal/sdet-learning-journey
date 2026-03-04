package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet hs =new HashSet();
		hs.add(100);
		hs.add("Roopa");
		hs.add('K');
		hs.add(true);
		hs.add(10.24);
		hs.add(null);
		hs.add(100);
		hs.add(null);
		
		System.out.println("Elements of hashset "+hs);
		
		//size of the array
		System.out.println("size "+hs.size());
		
		//remove the value
		hs.remove(100);
		System.out.println("Elements of hashset after removing "+hs);
		
		//remove particular values
		HashSet hs1 =new HashSet();
		hs1.add(null);
		hs1.add(true);
		
		hs.removeAll(hs1);
		System.out.println("Elements after removing perticluar items"+hs);
		
		//reading all the values of hash using for each loop
		System.out.println("reading all the values of hash using loop");
		for(Object x:hs)
		{
			System.out.println(x);
		}
		
		//reading all the values of hash using iterator
		System.out.println("reading all the values of hash using iterator method");
		Iterator it=hs.iterator();
		while(it.hasNext())

		{System.out.println(it.next());}
		
		
		//converting the hasset to arraylist and get the value by index
		ArrayList ar=new ArrayList(hs);
		System.out.println("Get the value by index"+ar.get(1));
	}

}
