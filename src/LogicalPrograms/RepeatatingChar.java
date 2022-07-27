package LogicalPrograms;

 	import java.util.HashMap;
 	import java.util.Set;
 	public class RepeatatingChar {
 		public static void main(String[] args)
 		{
 			String a="abcxyzabcpqrabc";
 			//hashMap Object created
 			HashMap<Character, Integer> mp= new HashMap<Character, Integer>();
 			for(int i=0;i<=a.length()-1;i++)//i=0,1
 			{
 				char charValue = a.charAt(i);//a,b//a
 				if(mp.containsKey(charValue))
 				{
 					mp.put(charValue, mp.get(charValue)+1);
 				}
 				else
 				{
 					mp.put(charValue, 1);//a,1//b,1//
 				}
 			}
 			Set<Character>keys=mp.keySet();//[a,b,c]
 			for(Character key:keys)
 			{
 				System.out.println(key+" =" + mp.get(key));
 			}
 		}


}
