package mx.learnjava.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import mx.learnjava.data.Student;
import mx.learnjava.data.StudentDataBase;

public class StreamsMapExample {
	
	public static List<String> namesList(){
		List<String> studentList = StudentDataBase.getAllStudents().stream()	// Stream<Student>
			// Student as an input -> Student Name
			.map(Student::getName)	// Stream<String>
			.map(String::toUpperCase)
			.collect(Collectors.toList()); // List<String>
		
		return studentList;
	}
	
	public static Set<String> namesSet(){
		Set<String> studentList = StudentDataBase.getAllStudents().stream()	// Stream<Student>
			// Student as an input -> Student Name
			.map(Student::getName)	// Stream<String>
			.map(String::toUpperCase)
			.collect(Collectors.toSet()); // List<String>
		
		return studentList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(namesList());
		System.out.println(namesSet());
	}

}
