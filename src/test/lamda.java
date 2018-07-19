package test;
/**
 * lambda
 */

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lamda {
	public static void main(String[] args) {
	        List<String> languages = Arrays.asList("java","scala","python");
	        //before java8
	        for(String each:languages) {
	            System.out.println(each);
	        }
	        //after java8
	        languages.forEach(y -> System.out.println(y));
	        languages.forEach(x -> System.out.println(x));
	        languages.forEach(System.out::println);
	    }
	 	@Test
	    public void filterTest() {
	        List<Double> cost = Arrays.asList(10.0, 20.0,30.0,40.0);
	        List<Double> filteredCost = cost.stream().filter(x -> x > 25.0).collect(Collectors.toList());
	        filteredCost.forEach(x -> System.out.println(x));

	    }
	 	@Test
	 	public void test1() {
	 		StringBuffer str = new StringBuffer();
	 		str.append("abcdef");
	 		System.out.println(str);
	 	}
}
