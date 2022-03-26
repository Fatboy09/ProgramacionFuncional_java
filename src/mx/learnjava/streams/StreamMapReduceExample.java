package mx.learnjava.streams;

import mx.learnjava.data.Student;
import mx.learnjava.data.StudentDataBase;

public class StreamMapReduceExample {
	
	private static int noOfNotebooks() {
		int numberOfNotebooks = StudentDataBase.getAllStudents().stream()
			.filter(student -> student.getGradeLevel() >= 3)
			.filter(student -> student.getGender().equals("female"))
			.map(Student::getNotebooks)
			//.reduce(0,(a,b) -> a+b);	// opcion 1
			.reduce(0, Integer::sum);	// opcion 2
		
		return numberOfNotebooks;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number of notebooks: " + noOfNotebooks());
	}

}
