
public class Student extends Person {
	
	
	private final String STATUS;
	public static int numberofStudents;
	/**
	 * Creates the student and returns their grade and has a counter to keep track of how many students have been created.
	 * @param s
	 */
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
/**
 * Method for destroying student
 * @return
 */
	public Student finalizeS(){
		numberofStudents--;
		return null;
	}
	
	
	}

