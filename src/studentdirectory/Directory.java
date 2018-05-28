package studentdirectory;

public class Directory {
	
	// This function lists all the students.
	public static void listStudents(Student students[]) {
		clear();
		System.out.println("Listing all students...");
		for (int i = 0; i < 6; i++) {
			System.out.println(students[i]);
		}
	}
	// This function lists the students with the specified course.
	public static void listStudents(Student students[], String course) {
		clear();
		System.out.println("Listing all students with the course \"" + course + "\"...");
		for (int i = 0; i < 6; i++) {
			if (course.toUpperCase().equals(students[i].getCourse().toUpperCase())) {
			System.out.println(students[i]);
			}
		}
	}
	// This function lists the students with the specified the age.
	public static void listStudents(Student students[], int age) {
		clear();
		System.out.println("Listing all students with the age \"" + age + "\"...");
		for (int i = 0; i < 6; i++) {
			if (age == students[i].getAge()) {
			System.out.println(students[i]);
			}
		}
	}
	// This function lists the students with the specified first name.
	public static void listStudents(String firstName, Student students[]) {
		clear();
		System.out.println("Listing all students with the first name \"" + firstName + "\"...");
		for (int i = 0; i < 6; i++) {
			if (firstName.toUpperCase().equals(students[i].getFirstName().toUpperCase())) {
			System.out.println(students[i]);
			}
		}
	}
	// This function lists the students with the specified last name.
	public static void listStudents(int i, Student students[], String lastName) {
		clear();
		System.out.println("Listing all students with the last name \"" + lastName + "\"...");
		for (i = 0; i < 6; i++) {
			if (lastName.toUpperCase().equals(students[i].getLastName().toUpperCase())) {
			System.out.println(students[i]);
			}
		}
	}
	// This function lists the students with the specified student ID.
	public static void listStudents(Student students[], String studentID, int i) {
		clear();
		System.out.println("Listing all students with the student ID \'" + studentID + "\'...");
		for (i = 0; i < 6; i++) {
			if (studentID.toUpperCase().equals(students[i].getStudentID().toUpperCase())) {
			System.out.println(students[i]);
			}
		}
	}
	// This function lists the students with the specified year.
	public static void listStudent(int i, Student students[], String year) {
		clear();
		System.out.println("Listing all students with the studentID \'" + year + "\'...");
		for (i = 0; i < 6; i++) {
			if (year.toUpperCase().equals(students[i].getYear().toUpperCase())) {
			System.out.println(students[i]);
			}
		}
	}
	public static void clear() {
		for (int x = 0; x < 3; x++) {
			System.out.println();
		}
	}
}
