package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		
		al.add("velocity");
		al.add("may 21 ");//1
		al.add(90);//2
		al.add('A');//3
		al.add(99.99f);//4
		al.add("velocity");//5
		al.add(null);//6
		al.add(null);//7
		al.add("sanjay");//8
		al.add("velocity");//9
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.indexOf("sanjay"));
		System.out.println(al.lastIndexOf("velocity"));
		
		al.add(5, "raju");
		System.out.println(al);
		al.set(3, 'B');// update // old remove
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.contains("sanjay"));
	
		System.out.println(al.get(5));
		al.add(1, "june 20");// right shift
		System.out.println(al);
		
		al.remove(4);// left shift
		System.out.println(al);
		System.out.println("============");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("=================");
		// iterator concept
		// class         // method
		
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("===========******==========");
		// list iterator
		
		ListIterator lit = al.listIterator();// its a generic arraylist
		
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
		System.out.println("=======****==**=======");
		// for each loop-- very simple
		
		for(Object j: al)
		{
			System.out.println(j);
		}
		
		ArrayList<Integer>at= new ArrayList<>();// its a homogenious arraylist integer type
		at.add(1);
		at.add(2);
		at.add(3);
		at.add(4);
		at.add(6);
		
		for(Integer k:at)
		{
			System.out.println(k);
		}
		System.out.println("=============");
		ArrayList<Character> ac= new ArrayList<>();// character type
		
		ac.add('A');
		ac.add('B');
		ac.add('C');
		ac.add('D');
		ac.add('E');
		ac.add('F');
		ac.add('B');
		
		for(Character o :ac)
		{
			System.out.println(o);
		}
		System.out.println("============");
		
		Iterator<Character> r = ac.iterator();
		while(r.hasNext())
		{
			System.out.println(r.next());
		}
		
		
		
	}

}
