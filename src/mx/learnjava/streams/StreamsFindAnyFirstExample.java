package mx.learnjava.streams;

import java.util.Optional;

import mx.learnjava.data.Student;
import mx.learnjava.data.StudentDataBase;

public class StreamsFindAnyFirstExample {
	
	public static Optional<Student> findAnyStudent() {
		return StudentDataBase.getAllStudents().stream()
			.filter(student -> student.getGpa() >= 3.9)
			.findAny();
	}
	
	public static Optional<Student> findFirstStudent() {
		return StudentDataBase.getAllStudents().stream()
			.filter(student -> student.getGpa() >= 4.1)
			.findFirst();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<Student> studentOptionalFindAny = findAnyStudent();
		if(studentOptionalFindAny.isPresent()) {
			System.out.println("Found the student: " + studentOptionalFindAny.get());
		} else {
			System.out.println("Student not found");
		}
		System.out.println(">>>>>>>>>>>>>>>>>>");
		Optional<Student> studentOptionalFindFirst = findFirstStudent();
		if(studentOptionalFindFirst.isPresent()) {
			System.out.println("Found the student: " + studentOptionalFindFirst.get());
		} else {
			System.out.println("Student not found");
		}
	}

}
