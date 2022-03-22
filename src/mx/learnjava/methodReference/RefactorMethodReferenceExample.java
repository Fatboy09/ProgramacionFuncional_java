package mx.learnjava.methodReference;

import java.util.function.Predicate;

import mx.learnjava.data.Student;
import mx.learnjava.data.StudentDataBase;

public class RefactorMethodReferenceExample {
	
	static Predicate<Student> p1 = RefactorMethodReferenceExample::greatherThanGradeLevel;
	
	public static boolean greatherThanGradeLevel(Student student) {
		return student.getGradeLevel() >= 3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
	}

}
