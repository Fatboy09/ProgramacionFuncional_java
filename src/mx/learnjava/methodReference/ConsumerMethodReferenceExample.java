package mx.learnjava.methodReference;

import java.util.function.Consumer;

import mx.learnjava.data.Student;
import mx.learnjava.data.StudentDataBase;

public class ConsumerMethodReferenceExample {
	
	/**
	 * Classname::methodName
	 */
	static Consumer<Student> c1 = System.out::println;
	/**
	 * Classname::instanceMethodName
	 */
	static Consumer<Student> c2 = Student::printListActivities;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDataBase.getAllStudents().forEach(c1);
		System.out.println(">>>>>>>>>>>>>");
		StudentDataBase.getAllStudents().forEach(c2);
	}

}
