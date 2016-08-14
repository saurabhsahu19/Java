/**
 * 
 */
package Comparator;

/**
 * @author Saurabh
 *
 */
public class Employee implements Comparable{
	int empID;
	String name;
	Employee(int empID, String name){
		this.empID = empID;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpID() {
		return empID;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee e = (Employee)o;
		if(e.empID > this.empID)
			return 1;
		if(e.empID < this.empID)
			return -1;
		return 0;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empID;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empID != other.empID)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
