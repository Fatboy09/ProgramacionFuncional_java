package mx.learnjava.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import mx.learnjava.data.Student;
import mx.learnjava.data.StudentDataBase;

public class PredicateAndConsumerExample {
	
	Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
	Predicate<Student> p2 = s -> s.getGpa() >= 3.9;
	
	BiConsumer<String, List<String>> studentBiconsumer = 
			(name,activities) -> System.out.println(name + ':' + activities);
	
	Consumer<Student> studentConsumer = (student) -> {
		if(p1.and(p2).test(student)) {
			studentBiconsumer.accept(student.getName(), student.getActivities());
		}
	};
	
	public void printNameAndActivities(List<Student> students) {
		students.forEach(studentConsumer);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = StudentDataBase.getAllStudents();
		new PredicateAndConsumerExample().printNameAndActivities(studentList);
	}

}
