package com.ibm.training.java8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Streams - source and flow of data
 * Intermediate operations - 
 * Terminal Operations
 * 
 * Source->IM1->IM2-IM3->......->T
 * Intermediate Operations - 
 * anyMatch(), distinct(), filter(). findFirst(), flatmap(), map(), skip(),sorted()
 * Terminal Operations - 
 * count(), max(), min(), reduce(), sumaryStatistics()
 */
public class StreamApiDemo {

	public static void main(String[] args) throws IOException {
		
		//IntStream.rangeClosed(1, 10).forEach(System.out::println);
		//IntStream.rangeClosed(1, 10).skip(5).forEach(System.out::println);
		//Stream.of(1,3,2,2,4,5,3,1).distinct().sorted().forEach(System.out::println);
		// TODO Auto-generated method stub
		
		List<String> filteredObjects = Stream.of("Apple", "Samsung", "Redmi", "Realme", "Redmi")
		.filter(str->str.startsWith("R"))
		.sorted()
		.collect(Collectors.toList());
		for(String str: filteredObjects) {
			//System.out.println(str);
		}
		
		boolean isAMatch = Stream.of("Apple", "Samsung", "Redmi", "Realme", "Redmi")
				.filter(str->str.startsWith("R"))
				.anyMatch(str->str.startsWith("Rf"));
		//System.out.println(isAMatch);
		
		Stream<String> stream = Files.lines(Path.of(".\\test.txt"));
		Map<String, String> map = stream.map(str -> str.split(",")).filter(arr -> arr.length == 3).filter(arr -> Integer
				.parseInt(arr[1]) >= 15).collect(Collectors.toMap(arr->arr[0], arr->arr[1]));/*
											 * forEach(arr->{ System.out.println(arr[0]+" "+arr[1]+" "+arr[2]); });
											 */
		for(String key: map.keySet()) {
			//System.out.println(key+" "+map.get(key));
		}
		stream.close();
		
		//Stream.of(1,2,3,4,5).map(i->i*2).forEach(System.out::println);
		//One to one mapping
		List<String> emailIds = Arrays.stream(Dataset.customers).map(Customer::getEmailId).collect(Collectors.toList());
		for(String emailId: emailIds) {
			//System.out.println(emailId);
		}
		//One to many mapping
		//[[1,2],[2,3],[3,4]]->flatten->[1,2,2,3,3,4]
		List<String> contactNos = Arrays.stream(Dataset.customers).flatMap(customer->customer.getContactNo().stream()).collect(Collectors.toList());
		for(String contactNo: contactNos) {
			//System.out.println(contactNo);
		}
		//n*n+1/2->10*11/2 -> 55
		int result = IntStream.rangeClosed(1, 10).reduce(0,(sum, num)->sum+num);
		//System.out.println(result);
		
		IntSummaryStatistics summary = IntStream.rangeClosed(1, 10).summaryStatistics();
		//System.out.println(summary);
		
		Optional<String> optional = Stream.of("Apple", "Samsung", "Redmi", "Realme")
		.filter(str->str.startsWith("R")).findFirst();
		//System.out.println(optional.get());
		//optional.ifPresent(System.out::print);
		//optional.ifPresentOrElse(System.out::print, ()->System.out.println("Empty optional"));
		System.out.println(optional.equals(Optional.of("Redmi")));
		System.out.println(Optional.empty());
		System.out.println(Optional.of("Apple"));
		System.out.println(Optional.ofNullable(null));
		
		List<String> list = null;
		List<String> list1 = Optional.ofNullable(list).orElse(new ArrayList<>());
	}

}
