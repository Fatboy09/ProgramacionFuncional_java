package mx.learnjava.methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
	
	static Function<String, String> toUppercaseLambda = s -> s.toUpperCase();
	static Function<String, String> toUpperMethodRef = String::toUpperCase;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toUppercaseLambda.apply("java8"));
		System.out.println("<<<<<<<<<<<<<<");
		System.out.println(toUpperMethodRef.apply("java8"));
	}

}
