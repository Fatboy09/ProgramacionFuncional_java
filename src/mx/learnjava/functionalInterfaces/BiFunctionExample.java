package mx.learnjava.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import mx.learnjava.data.Student;
import mx.learnjava.data.StudentDataBase;

public class BiFunctionExample {
	
	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = 
			((students, studentPredicate) -> {
				Map<String,Double> studenGradeMap = new HashMap<>();
				students.forEach(student -> {
					if(studentPredicate.test(student)) {
						studenGradeMap.put(student.getName(), student.getGpa());
					}
				});
				return studenGradeMap;
			});
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),PredicateStudentExample.p2));
	}

}
