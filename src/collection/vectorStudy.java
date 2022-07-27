package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vectorStudy {

	public static void main(String[] args) {


		Vector v = new Vector();// vector generic type
		
		v.add("pune");
		v.add('M');
		v.add("pune");
		v.add(null);
		v.add(null);
		v.add(123);
		v.add(12.5f);
		v.add(true);
		
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.remove(0));
		System.out.println(v);
		System.out.println(v.get(3));
		System.out.println("==================");
		// for
		// for each
		// iterator
		
		
		ListIterator lit = v.listIterator();// lstiterator
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		System.out.println("=========**=========");
		// by using enumration
		Enumeration el = v.elements();
		while(el.hasMoreElements())
		{
			System.out.println(el.nextElement());
		}
		System.out.println("=========****===========");
		
		// for itrator
		
		Iterator it = v.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// for 
		System.out.println("+++++++++++++++++");
		for (int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		// for each
		System.out.println("+++++++++++++++++");
		for(Object a:v)
		{
			System.out.println(a);
		}
		
		
		
		
	}

}
