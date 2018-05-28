package studentdirectory;

public class Main {

	public static void main(String[] args) {

		Student[] students = new Student[6];
		for (int i = 0; i < 6; i++) {
			students[i] = new Student();
		}
		
		Directory.fillDirectory(students);
		
		// Change these values to get different outputs 
		String firstName = "John";
		String lastName = "Nguyen";
		String studentID = "201701";
		String course = "IT";
		int age = 17;
		int i = 0;
		
		Directory.listStudents(students); // Lists all students.
		Directory.listStudents(students, course); // Lists the students with the specified course.
		Directory.listStudents(students, studentID, i); // Lists the students with the specified student ID.
		Directory.listStudents(students, age); // Lists the students with the specified age.
		Directory.listStudents(firstName, students); // Lists the students with the specified first Name.
		Directory.listStudents(i, students, lastName); // Lists the students with the specified last Name.
		
	}
}