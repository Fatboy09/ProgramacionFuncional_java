package mx.learnjava.constructorReference;

import java.util.function.Function;
import java.util.function.Supplier;

import mx.learnjava.data.Student;

public class ConstructorReferenceExample {
	
	static Supplier<Student> studentSupplier = Student::new;
	
	static Function<String, Student> studentFunction = Student::new;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(studentSupplier.get());
		System.out.println(">>>>>>>>>>>>>>>>>>>");
		System.out.println(studentFunction.apply("Escom"));
	}

}
