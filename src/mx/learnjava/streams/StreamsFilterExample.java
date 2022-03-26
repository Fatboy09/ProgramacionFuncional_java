package mx.learnjava.streams;

import java.util.List;
import java.util.stream.Collectors;

import mx.learnjava.data.Student;
import mx.learnjava.data.StudentDataBase;

public class StreamsFilterExample {
	
	public static List<Student> filterStudents() {
		return StudentDataBase.getAllStudents()
			.stream()	// Stream<Student>
			.filter((student -> student.getGender().equals("female")))	//Stream<Student>
			// filter and sends only the students whose gender is female
			.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		filterStudents().forEach(System.out::println);
	}

}
