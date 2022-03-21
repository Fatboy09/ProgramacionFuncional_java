package mx.learnjava.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import mx.learnjava.data.Student;
import mx.learnjava.data.StudentDataBase;

public class BiConsumerExample {
	
	public static void nameAndActivities() {
		BiConsumer<String, List<String>> biconsumer = (name,activities) -> 
			System.out.println(name + ":" + activities);
		List<Student> listStudents = StudentDataBase.getAllStudents();
		listStudents.forEach(student -> biconsumer.accept(student.getName(), student.getActivities()));
	}
	
	public static void main(String[] args) {
		BiConsumer<String, String> biConsumer = (a,b) -> System.out.println("a:" + a + " , b:" + b);
		BiConsumer<Integer, Integer> multiply = (a,b) -> System.out.println("Multiplication is: " + a*b);
		BiConsumer<Integer, Integer> division = (a,b) -> System.out.println("Division is: " + a/b);
		
		biConsumer.accept("java7", "java8");
		multiply.andThen(division).accept(10, 5);
		nameAndActivities();
	}

}
