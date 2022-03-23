package mx.learnjava.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		names.add("adam");
		names.add("jim");
		names.add("jenny");
		
		for(String name: names) {
			System.out.println(name);
		}
		
		for(String name: names) {
			System.out.println(name);
		}
		
		names.remove(0);
		System.out.println(names);
		
		Stream<String> nameStream = names.stream();
		nameStream.forEach(System.out::println);
	}

}
