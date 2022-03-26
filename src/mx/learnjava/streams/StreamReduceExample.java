package mx.learnjava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import mx.learnjava.data.Student;
import mx.learnjava.data.StudentDataBase;

public class StreamReduceExample {
	
	public static int performMultiplication(List<Integer> integerList) {
		return integerList.stream()
			.reduce(1, (a,b) -> a*b);
	}
	
	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
		return integerList.stream()
			.reduce((a,b) -> a*b);
	}
	
	public static Optional<Student> getHighestGPAStudent() {
		return StudentDataBase.getAllStudents().stream()
			.reduce((s1,s2) -> s1.getGpa() > s2.getGpa()? s1:s2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integers = Arrays.asList(1,3,5,7);
		List<Integer> integers2 = new ArrayList<Integer>();
		System.out.println(performMultiplication(integers));
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<");
		Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
		System.out.println(result.isPresent());
		System.out.println(result.get());
		
		Optional<Integer> result2 = performMultiplicationWithoutIdentity(integers2);
		System.out.println(result2.isPresent());
		if(result2.isPresent()) {
			System.out.println(result2.get());
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
		Optional<Student> optionalStudent = getHighestGPAStudent();
		if(optionalStudent.isPresent()) {
			System.out.println(optionalStudent.get());
		}
	}

}
