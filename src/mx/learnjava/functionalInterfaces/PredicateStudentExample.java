package mx.learnjava.functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;
import mx.learnjava.data.Student;
import mx.learnjava.data.StudentDataBase;

public class PredicateStudentExample {
	
	static Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
	static Predicate<Student> p2 = s -> s.getGpa() >= 3.9;
	
	public static void filterStudentByGradeLevel() {
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach(student -> {
			if(p1.test(student)) {
				System.out.println(student);
			}
		});
	}
	
	public static void filterStudentByGpa() {
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach(student -> {
			if(p2.test(student)) {
				System.out.println(student);
			}
		});
	}
	
	public static void filterStudent() {
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach(student -> {
			if(p1.or(p2).negate().test(student))
				System.out.println(student);
			else {
				System.out.println(student);
			}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		filterStudentByGradeLevel();
		System.out.println(">>>>>>>>>>>>>");
		filterStudentByGpa();
		System.out.println("<<<<<<<<<<<<<");
		filterStudent();
	}

}
