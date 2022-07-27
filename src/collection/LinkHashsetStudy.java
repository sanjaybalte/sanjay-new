package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHashsetStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet hs = new LinkedHashSet();
		hs.add("pune");
		hs.add("pune");
		hs.add('A');
		hs.add(null);
		hs.add(null);
		hs.add(1);
		hs.add(12.2);
		hs.add(true);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		//System.out.println(hs.clone());
		System.out.println(hs);
		
		for(int i=0;i<=hs.size()-1;i++)
		{
			System.out.println(hs);
		}
		System.out.println("=========================");
		for(Object h:hs)
		{
			
			System.out.println(h);
		}
		System.out.println("=========================");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
