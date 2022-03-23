package mx.learnjava.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import mx.learnjava.data.Student;
import mx.learnjava.data.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Student> studentPredicate = student -> student.getGradeLevel() >= 3;
		Predicate<Student> studentgpaPredicate = student -> student.getGpa() >= 3.9;
		
		// Student name and their activities in a map
		Map<String,List<String>> studentMap = StudentDataBase.getAllStudents().stream()
				.filter(studentPredicate)
				.filter(studentgpaPredicate)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		System.out.println(studentMap);
	}

}
