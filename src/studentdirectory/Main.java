package studentdirectory;

public class Main {

	public static void main(String[] args) {

		Student[] students = new Student[6];
		for (int i = 0; i < 6; i++) {
			students[i] = new Student();
		}
		
		fillDirectory(students);
		
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

}
