
public class Person {
	private String name;
	private String address;
	private String phone;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString(){
		return "Person" + getName();
	}
}
	/*public class Student extends Person {
		
		
		private final String STATUS;
		public static int numberofStudents;
		
		public Student (String s){
		
			STATUS=s;
			numberofStudents++;
			
		}

		public String getSTATUS() {
			return STATUS;
		}

		public int getNumberofStudents() {
			return numberofStudents;
		}

		public void setNumberofStudents(int numberofStudents) {
			this.numberofStudents = numberofStudents;
		}
		public String toString(){
			return "Student: " + getName();
		}
	}

	public class Employee extends Person {
	
	private String office;
	private double salary;
	private String dateHired;
	public Employee(){
	
	}
	
	public Employee(String a, double b, String c){
		setOffice(a);
		setSalary(b);
		setDateHired(c);
		
	}
	
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDateHired() {
		return dateHired;
	}
	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	public  String toString(){
		return  "Employee: " + getName();
	}

	}
	public class Faculty extends Employee{
		private String officeHours;
		private int rank;
		//public Faculty(){
			
		//}
		public String getOfficeHours() {
			return officeHours;
		}
		public void setOfficeHours(String officeHours) {
			this.officeHours = officeHours;
		}
		public int getRank() {
			return rank;
		}
		public void setRank(int rank) {
			this.rank = rank;
		}
		
		public String toString(){
			
			return  "Faculty: " + getName();
		
		}
	
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
	*/

	
	
	
	

	

