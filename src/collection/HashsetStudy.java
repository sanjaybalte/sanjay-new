package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetStudy {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		
		System.out.println(hs.add("pune"));
		System.out.println(hs.add("pune"));// duplicate not allowed
		hs.add("pune");
		hs.add("pune");
		hs.add("pune");
		hs.add('A');
		hs.add(null);
		hs.add(null);
		hs.add(1);
		hs.add(12.2);
		hs.add(true);
		
		System.out.println(hs);//duplicate not allowed// add method boolean type 
		// size capacity contains 
		// for
		//for each
		// iterator
		
		
		
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("pune"));
		// for
		
		System.out.println("==================");
		
		for(int i=0;i<=hs.size()-1;i++)
		{
			System.out.println(hs);//****
		}
		//for each
		System.out.println("==================");
		
		for(Object h:hs)
		{
			System.out.println(h);
		}
		System.out.println("==================");
		// iterator
		Iterator it =hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("====================");
		
	}

}
