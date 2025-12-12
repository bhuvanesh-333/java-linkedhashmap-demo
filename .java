package collections;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

// ----->Maintains order
// -----> Key-value pairs preserved in the order added

//to check the two interger values 


class p{
	static void dispaly() {
		
		LinkedHashMap<Integer, Integer> a=new LinkedHashMap<Integer, Integer>();
		a.put(null, null);
		a.put(null, null);   // ------> to check the duplicate values 
		a.put(1 ,2 );
		a.put(1 , 2);
		a.put(2 ,2 );          // -----> to check the insertion order 
		a.put( 2, 3);
		a.put( 5, 3);
		a.put( 4, 5);
		a.put(9 , 5);
		a.put(6 , 7);
		
		System.out.println(a);
		
	}
	
	
	static void output() {
		LinkedHashMap<String, Integer> b=new LinkedHashMap<String, Integer>();
		b.put("a", 1);
		b.put("a", 2);
		b.put("b", 1);
		b.put("c", 1);
		b.put("d", 1);
		b.put("s", 1);
		b.put("f", 1);
		b.put("z", 1);
		b.put("h", 1);
		
		System.out.println(b);
	}
}




public class linkedhashmap {

	public static void main(String[] args) {
		p.dispaly();
		p.output();

	}

}
