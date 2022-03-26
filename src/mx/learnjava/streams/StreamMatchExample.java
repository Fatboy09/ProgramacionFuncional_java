package mx.learnjava.streams;

import mx.learnjava.data.StudentDataBase;

public class StreamMatchExample {
	
	public static boolean allMatch() {
		return StudentDataBase.getAllStudents().stream()
			.allMatch(student -> student.getGpa() >= 3.5);
	}
	
	public static boolean anyMatch() {
		return StudentDataBase.getAllStudents().stream()
			.anyMatch(student -> student.getGpa() >= 4.1);
	}
	
	public static boolean noneMatch() {
		return StudentDataBase.getAllStudents().stream()
			.noneMatch(student -> student.getGpa() >= 4.1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Result of all Match: " + allMatch());
		System.out.println("Result of any Match: " + anyMatch());
		System.out.println("Result of any Match: " + noneMatch());
	}

}
