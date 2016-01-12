package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
class SetDemo {
public static void main(String [] args) {
	
	List<Integer> c= new ArrayList<Integer>();
	c.add(1);
	c.add(5);
	c.add(2);
	c.add(3);
	c.add(9);
	
HashSet<Integer> hs = new HashSet<Integer>();
hs.add(new Integer(72));
hs.add(new Integer(58));
hs.add(new Integer(12));
hs.add(new Integer(98));
hs.add(new Integer(34));

LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
lhs.add(new Integer(72));
lhs.add(new Integer(58));
lhs.add(new Integer(12));
lhs.add(new Integer(98));
lhs.add(new Integer(34));

TreeSet<Integer> ts = new TreeSet<Integer>();
ts.add(new Integer(72));
ts.add(new Integer(58));
ts.add(new Integer(12));
ts.add(new Integer(98));
ts.add(new Integer(34));

LinkedList<Integer> tg = new LinkedList<Integer>();
tg.add(new Integer(72));
tg.add(new Integer(58));
tg.add(new Integer(12));
tg.add(new Integer(98));
tg.add(new Integer(34));


System.out.println("Arraylist is : " + c);


System.out.println("HashSet  - Unordered\tSize : "+hs.size());
System.out.println(hs);
System.out.println();

System.out.println("LinkedHashSet - Ordered\tSize : "+lhs.size());
System.out.println(lhs);
System.out.println();

System.out.println("TreeSet   - Sorted\tSize : "+ts.size());
System.out.println(ts);
System.out.println();

System.out.println("list   - unordered\tSize : "+c.size());
System.out.println(c);
System.out.println();

System.out.println("Linked list  - ordered\tSize : "+tg.size());
System.out.println(tg);
System.out.println();
}
}


