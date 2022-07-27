package string;

public class Stringstudy {

	public static void main(String[] args) {
		String name1= "test";
		int a=10;
		
		// object creation of string can be done in two ways
		
		// 1.without using new keyword  ---> String s1="abc";
		// 2.with using new keywords  -----> String s2= new string ("xyz");
		
		// 1.without using new keyword
		String city="pune";
		System.out.println("value of city is "+city);
		
		// 2.with using new keywords
		
		String state= new String("maharashtra");
		System.out.println("name of state is "+state);
		System.out.println("==============================");
		System.out.println("========string metthods ==============");
		// length() method use
		
		String name= "velocity";
		System.out.println(name.length());
		int lengthofstring=name.length();
		System.out.println(lengthofstring);
		// toUppercase() method use
		System.out.println(name);
		System.out.println(name.toUpperCase());
		// OR
		String m= name.toUpperCase();
		System.out.println(m);
		
		// toLowercase() method use
		
		System.out.println(m.toLowerCase());
		
		String n=m.toLowerCase();
		System.out.println(n);
		
		// == method use // this methods checks memory location
		
		String b= "Velocity";
		String c= "Velocity";
		String d= new String("Velocity");
		String e= new String("Velocity");
		String f= new String("velocity");
		System.out.println(b==c);
		System.out.println(d==e);// ??
		System.out.println("=======================");
		// equal to  method use // this methods checks contains // compare objects
		System.out.println(b.equals(c));
		System.out.println(b.equals(d));
		System.out.println(b.equals(e));
		
		boolean result=b.equals(d);
		System.out.println("a and c are equal "+result);
		System.out.println("========================");
		
		// equalsIgnoreCase()
		System.out.println(e.equals(f));// checking character sequence along  with case sencevity
		
		String City= "Pune";
		String Location= "Pune";
		String dist= "pune";
		System.out.println(City.equals(dist));
		System.out.println(City.equalsIgnoreCase(dist));
		
		// contains() method use
		String k= "Katraj";
		System.out.println(k.contains("Ka"));
		System.out.println(k.contains("ar"));
		
		
		
		System.out.println("==================================");
		// is empty method use
		String p = "test";
		String q= " ";
		String r = null;
		String s= "";
		System.out.println(q.length());
		//System.out.println(r.length());
		System.out.println(p.isEmpty());
		System.out.println(q.isEmpty());
		System.out.println(s.isEmpty());
		//System.out.println(r.isEmpty());
		System.out.println("==================================");
		// isBlank() use
		//System.out.println(r.isBlank());// we cant operate on null value
		System.out.println(q.isBlank());
		System.out.println(s.isBlank());
		// charAt use// depends on index
		System.out.println("==================================");
		String country="INDIA";
		System.out.println(country.charAt(0));
		//System.out.println(requierdChar);
		System.out.println(country.charAt(4));// out of boundary// Exception --> string index outof boundary
		System.out.println(country.charAt(1));// out of boundary// Exception --> string index outof boundary
		System.out.println("=======HYH5TH==========================");
		// endsWith use
		String country1="INDIA";
		System.out.println(country1.endsWith("IND"));//--->false
		System.out.println(country1.endsWith("IA"));//--->true
		System.out.println(country1.endsWith("INDIA"));//--->true
		
		System.out.println("============NTHNENBTB======================");
		
		// startWith method use
		
		System.out.println(country1.startsWith("INDIA"));// true
		System.out.println(country1.endsWith("IA"));//--->false
		System.out.println(country1.endsWith("INDIA"));//--->true
		System.out.println(country.startsWith("A", 4));//true
		System.out.println(country.startsWith("DI", 2));//true
		System.out.println(country.startsWith("IN", 2));//false
		System.out.println(country.startsWith("IN", 0));//true
		System.out.println("=============WFWF=====================");
		// substring method use
		String testing="VELOCITY CORPORATE TRAINING CENTER";
		String resultString = testing.substring(9);
		System.out.println(resultString);//-->CORPORATE TRAINING CENTER
		String resultString1 = testing.substring(20);
		System.out.println(resultString);//-->raining center
		String resultString2 = testing.substring(28);
		System.out.println(resultString);//-->center
		System.out.println(testing.subSequence(9, 17));//corporat
		System.out.println(testing.subSequence(9, 18));//corporate
		System.out.println("==================================");
		// concat method study
		String x="pune";
		String y=" city";
		System.out.println(x.concat(y).concat(" katraj"));  // ==> pune city katraj
		System.out.println();
		System.out.println("==================================");
		// index of use
		String State ="maharashtra";
		System.out.println(State.indexOf('a'));//-->
		System.out.println(State.indexOf('a', 4));//-->5
		System.out.println(State.lastIndexOf('a'));//-->10
		System.out.println("==================================");
		// replace use method
		String tal="pune";
		System.out.println(tal.replace('p', ' '));//-->une
		System.out.println(tal.replace('p', 'm'));//--> mune
		System.out.println(tal.replace("pu", "ku"));//--> kune
		System.out.println("==================================");
		// replaceAll use method
		String talu="pune mumbai nagpur";
		System.out.println(talu.replaceAll(" ", "0"));// pune0mumbai0nagpur
		talu.replaceFirst("u", "*"); // p*ne mumbai nagpur
		System.out.println("==================================");
		// split use method
		
		
		
		
	}

}
