package mx.learnjava.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	
	static UnaryOperator<String> unaryOperator = s -> s.concat("Default");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(unaryOperator.apply("java8"));
	}

}
