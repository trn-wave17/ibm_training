package com.ibm.training.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) throws IOException {
		
		//IntStream.range(1, 10).forEach(System.out::println);
		//IntStream.rangeClosed(1, 10).skip(5).forEach(i->System.out.println(i));
		IntStream.rangeClosed(1, 10).average();//.ifPresent(System.out::println);
		//OptionalDouble optional = IntStream.rangeClosed(1, 10).average();
		System.out.println(Stream.of("Apple", "Samsung", "Redmi", "Apple", "Samsung", "Realme")
		.distinct()
		.filter(str->str.startsWith("R"))
		.count());
		//.forEach(System.out::println);
		
		
		 Stream<String> stream = Files.lines(Path.of(".\\test.txt"));
		//stream.forEach(System.out::println);
		//System.out.println();
		 Map<String, String> map = stream.map(str->str.split(","))
		.filter(arr->arr.length>=3)
		.collect(Collectors.toMap(x->x[0], x->x[1]));
		stream.close();
		
		for(String key: map.keySet()) {
			//System.out.println(key+" "+map.get(key));
		}
		
		List<String> emailIds = Arrays.stream(Dataset.customers).map(Customer::getEmailId).collect(Collectors.toList());
		for(String emailId: emailIds)
			System.out.println(emailId);
		
		List<List<String>> contactNos = Arrays.stream(Dataset.customers).map(Customer::getContactNo).collect(Collectors.toList());
		for(List<String> contactNo: contactNos) {
			System.out.println(contactNo);
		}
		
		List<String> flattenedContactNos = Arrays.stream(Dataset.customers).flatMap(cust->cust.getContactNo().stream()).collect(Collectors.toList());
		for(String  contactNo: flattenedContactNos) {
			System.out.println(contactNo);
		}
	}

}
