package comparator;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectMethodAndCollectorsClass {
	 public static void main(final String[] args) {
		 
		final List<Person> people = Arrays.asList(
   		      new Person("Ross", 20),
   		      new Person("Monica", 21),
   		      new Person("Phoebe", 21),
   		      new Person("Rachel", 35));
		 
		 
		List<Person> olderThan20 = people.stream()
			                              .filter(person -> person.getAge() > 20)
			                              .collect(Collectors.toList());
		System.out.println("People older than 20: " + olderThan20);

		 
		 
		Map<Integer, List<Person>> peopleByAge = people.stream()
			                                           .collect(Collectors.groupingBy(Person::getAge));
	    System.out.println("Grouped by age: " + peopleByAge);
	    
	    
	    Map<Integer, List<String>> nameOfPeopleByAge =
	    		  people.stream()
	    		        .collect(
	    		          groupingBy(Person::getAge, mapping(Person::getName, toList())));
	    System.out.println("Let’s get only people’s names: " + nameOfPeopleByAge);
	    
		 
	 }
}
