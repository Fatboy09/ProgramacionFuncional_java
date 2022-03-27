package mx.learnjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsSkipLimitExample {
	
	public static Optional<Integer> limit(List<Integer> integers) {
		return integers.stream()
			.limit(3)	// Returns a stream consisting of the elements of this stream, truncated to be no longer than maxSize in length.
			.reduce((x,y) -> x+y);
	}
	
	public static Optional<Integer> skip(List<Integer> integers) {
		return integers.stream()
			.skip(3)	// Returns a stream consisting of the remaining elements of this stream after discarding the first n elements of the stream.
			.reduce((x,y) -> x+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integers = Arrays.asList(6,7,8,9,10);
		Optional<Integer> limitResult = limit(integers);
		if(limitResult.isPresent()) {
			System.out.println("The limit result is: " + limitResult.get());
		} else {
			System.out.println("No input is passed");
		}
		
		Optional<Integer> skipResult = skip(integers);
		if(skipResult.isPresent()) {
			System.out.println("The skip result is: " + skipResult.get());
		} else {
			System.out.println("No input is passed");
		}
	}

}
