package DataStructure.tweet;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class ValueComparator implements Comparator{
	HashMap<String, HashTagCount> table;
	ValueComparator(Map<String, HashTagCount> m){
		this.table = (HashMap<String, HashTagCount>) m;
	}	

	@Override
	/*By default: compare method takes key as parameter in Treemap
	 * (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if(o1 instanceof String && o2 instanceof String){
			String s1= (String)o1;
			String s2= (String)o2;
			HashTagCount hc1 = table.get(s1);
			HashTagCount hc2 = table.get(s2);
			if(hc1.getCount() > hc2.getCount()){
				System.out.println("returning 1");
				return 1;
			}
			else if(hc1.getCount() < hc2.getCount()){
				System.out.println("returning -1");
				return 1;
			}
			else if(hc1.getCount() == hc2.getCount()){
				System.out.println("returning default");
				return s1.compareTo(s2);
			}
			else{
				System.out.println("returning 0");
				return 0;
			}
		}
		return 0;
	}

}
