package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinklistStudy {

	public static void main(String[] args) 
	{

		LinkedList ll = new LinkedList();
		ll.add("pune");
		ll.add("pune");
		ll.add(null);
		ll.add(null);
		ll.add(123);
		ll.add(12.12);
		ll.add('A');
		ll.add(true);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.peek());// retrival but does not remove first element
		System.out.println(ll);
		System.out.println(ll.poll());//Retrieves and removes the head (first element) of this list
		System.out.println(ll.pollFirst());
		System.out.println(ll);// retrival and remove the first element
		System.out.println(ll.pollLast());
		System.out.println(ll);// retrival and remove the last element
		System.out.println(ll.pop());// retrival and remove the first element
		System.out.println(ll);
		System.out.println(ll.get(3));
		System.out.println(ll.remove(3));
		System.out.println(ll);
		
		ll.add("pune");
		ll.add('A');
		ll.add(true);
		System.out.println(ll);
		// for loop
		// for each
		// iterator
		// listiterator
		
		System.out.println("=============");
		// for loop
		
		for(int i =0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("=======**=====");
		// for each
		for(Object l:ll)
		{
			System.out.println(l);
		}
		System.out.println("=======**=====");
		
		// iterator
		
		Iterator it = ll.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		// listiterator
		System.out.println("=======****=======");
		
		ListIterator lit = ll.listIterator();// lstiterator
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		System.out.println("=======*****=====");
		
		
	}

}
