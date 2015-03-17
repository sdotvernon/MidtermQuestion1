

/**
 * Staff is a subclass of employee
 * @author seanvernon
 *
 */
public class Staff extends Employee {
	
	public Staff(){
		
	}
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String toString(){
		
		
			return "Staff: " + getName();
		
		}

}
