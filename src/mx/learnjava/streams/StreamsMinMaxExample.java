package mx.learnjava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
public class StreamsMinMaxExample {
	
	public static int findMaxValue(List<Integer> numbers) {
		return numbers.stream()
			.reduce(0,(x,y) -> x > y? x:y);
	}
	
	public static Optional<Integer> findMaxValueOptional(List<Integer> numbers) {
		return numbers.stream()
			.reduce((x,y) -> x > y? x:y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integerList = Arrays.asList(6,7,8,9,10);
		//List<Integer> integerList = new ArrayList<Integer>();
		System.out.println("Max value: " + findMaxValue(integerList));
		
		Optional<Integer> maxValueOptional = findMaxValueOptional(integerList);
		System.out.println("Optional Max is: " + maxValueOptional);
		if(maxValueOptional.isPresent()) {
			System.out.println("Max Value using optional: " + maxValueOptional.get());
		} else {
			System.out.println("Input list is empty");
		}
	}

}
