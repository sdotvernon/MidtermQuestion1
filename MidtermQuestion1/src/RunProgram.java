
public class RunProgram {

	public static void main(String args[]){
		/**
		 * creating two students and and employee
		 */
		Student MyStudent = new Student("Freshman");
		MyStudent.setName("Robert DeNiro");
		Employee MyEmployee = new Employee("2pm-8pm", 30000,"09-19-2011");
		MyEmployee.setName("Mohatma Ghandi");
		Student MyStudent2 = new Student("Sophomore");
		MyStudent.setName("Sam Bradford");
		
		
		System.out.println(MyStudent.getSTATUS());
		System.out.println(MyStudent2.getSTATUS());
		System.out.println(MyEmployee.getName() + " " + MyEmployee.getOffice() + " " + MyEmployee.getSalary() + " " + MyEmployee.getDateHired());
		
		
		System.out.println("This is how many Students have been created: " + MyStudent.getNumberofStudents());
		/**DESTROYING FIRST STUDENT
		**/
		MyStudent.finalizeS();
		/**
		 * printing out how many students were created
		 */
		System.out.println("This is how many Students have been created: " + MyStudent2.getNumberofStudents());
		
	}
}
