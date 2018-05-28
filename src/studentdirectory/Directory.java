package studentdirectory;

public class Directory {
	
	public static void fillDirectory(Student[] students) {
		
		students[0].setFirstName("John");
		students[0].setLastName("Smith");
		students[0].setCourse("IT");
		students[0].setYear("1st Year");
		students[0].setStudentID("201801");
		students[0].setAge(18);

		students[1].setFirstName("Mark");
		students[1].setLastName("Wallace");
		students[1].setCourse("IT");
		students[1].setYear("1st Year");
		students[1].setStudentID("201802");
		students[1].setAge(18);

		students[2].setFirstName("Tony");
		students[2].setLastName("Reese");
		students[2].setCourse("MA");
		students[2].setYear("2nd Year");
		students[2].setStudentID("201701");
		students[2].setAge(19);
		
		students[3].setFirstName("Liza");
		students[3].setLastName("Johnson");
		students[3].setCourse("BA");
		students[3].setYear("1st Year");
		students[3].setStudentID("201804");
		students[3].setAge(18);
		
		students[4].setFirstName("Kim");
		students[4].setLastName("Nguyen");
		students[4].setCourse("ECE");
		students[4].setYear("1st Year");
		students[4].setStudentID("201805");
		students[4].setAge(17);
		
		students[5].setFirstName("Keichi");
		students[5].setLastName("Takayama");
		students[5].setCourse("ECE");
		students[5].setYear("2nd Year");
		students[5].setStudentID("201702");
		students[5].setAge(17);
	}
	
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
