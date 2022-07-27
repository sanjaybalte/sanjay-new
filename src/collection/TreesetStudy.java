package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetStudy {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
		
		ts.add(12);
		ts.add(15);
		// ts.add('A');
		ts.add(20);
		ts.add(25);
		ts.add(30);
		ts.add(98);
		
		//ts.add(null);
		System.out.println(ts);
		System.out.println(ts.size());
		//System.out.println(ts.pollFirst());
		//System.out.println(ts.pollLast());
		System.out.println(ts);
		System.out.println(ts.isEmpty());
	
		// for loop
		// for each
		// iterator
		System.out.println("======================");
		for(int i=0;i<=ts.size()-1;i++)
		{
			System.out.println(ts);
		}
		System.out.println("======================");
		for(Object s:ts)
		{
			System.out.println(s);
		}
		
		Iterator itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
