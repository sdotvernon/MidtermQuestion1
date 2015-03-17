


public class Employee extends Person {
	
	private String office;
	private double salary;
	private String dateHired;
	public Employee(){
	
	}
	/**
	 * Creates an employee when you pass in their office hours, salary, and date hire.
	 * @param a
	 * @param b
	 * @param c
	 */
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
