package mx.learnjava.streams;

import java.util.List;
import java.util.stream.Collectors;

import mx.learnjava.data.Student;
import mx.learnjava.data.StudentDataBase;

public class StreamsFlatMapExample {
	
	public static List<String> printActivities() {
		List<String> studentActivities = StudentDataBase.getAllStudents().stream() // Stream<Student>
			.map(Student::getActivities)	// Stream<List<String>>
			.flatMap(List::stream) 			// Stream<String>
			.distinct()						// retorna un stream sin repeticiones
			.sorted()						// ordena los elementos del stream
			.collect(Collectors.toList());
		
		return studentActivities;
	}
	
	public static long getActivitiesCount() {
		long count = StudentDataBase.getAllStudents().stream() // Stream<Student>
			.map(Student::getActivities) 	// Stream<List<String>>
			.flatMap(List::stream)			//Stream<String>
			.distinct()						// retorna un stream sin repeticiones
			.count();						// retorna el total del elementos en el stream
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printActivities());
		System.out.println("Total Activities: " + getActivitiesCount());
	}

}
