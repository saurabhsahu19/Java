package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(123, "Anil");
		Employee e2 = new Employee(342, "Saurabh");
		Employee e3 = new Employee(431, "Gaurav");
		Employee e4 = new Employee(012, "Vishal");
		List l = new ArrayList<Employee>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		Collections.sort(l);
		Iterator i = l.iterator();
		while(i.hasNext()){
			Employee e = (Employee)i.next();
			System.out.println(e.getEmpID()+" "+e.getName());
		}
	}	

}
