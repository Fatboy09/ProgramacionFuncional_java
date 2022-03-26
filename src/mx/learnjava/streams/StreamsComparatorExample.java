package mx.learnjava.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import mx.learnjava.data.Student;
import mx.learnjava.data.StudentDataBase;

public class StreamsComparatorExample {
	
	public static List<Student> sortStudentsByName() {
		return StudentDataBase.getAllStudents()
			.stream()
			.sorted(Comparator.comparing(Student::getName))
			.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentsByGpa() {
		return StudentDataBase.getAllStudents()
			.stream()
			.sorted(Comparator.comparing(Student::getGpa))
			.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentsByGpaDesc() {
		return StudentDataBase.getAllStudents()
			.stream()
			.sorted(Comparator.comparing(Student::getGpa).reversed())
			.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Students sorted by name:");
		sortStudentsByName().forEach(System.out::println);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Students sorted by gpa:");
		sortStudentsByGpa().forEach(System.out::println);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Students sorted descending by gpa:");
		sortStudentsByGpaDesc().forEach(System.out::println);
	}

}
