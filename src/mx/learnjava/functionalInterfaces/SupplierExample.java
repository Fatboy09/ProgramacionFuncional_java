package mx.learnjava.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import mx.learnjava.data.Student;
import mx.learnjava.data.StudentDataBase;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Student> studentSupplier = () -> {
			return new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming","basketball","volleyball"));
		};
		
		Supplier<List<Student>> listSupplier = () -> {
			return StudentDataBase.getAllStudents();
		};
		
		System.out.println("Student is : " + studentSupplier.get());
		System.out.println("Students List : " + listSupplier.get());
	}

}
