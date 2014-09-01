package comparator;


import static java.util.Comparator.comparing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.function.Function;

public class Compare {
	
    public static void main(final String[] args) {
    	
    	final List<Person> people = Arrays.asList(
    		      new Person("Ross", 20),
    		      new Person("Monica", 21),
    		      new Person("Phoebe", 21),
    		      new Person("Rachel", 35));
    	
    
    	Comparator<Person> compareAscending =
    			  (person1, person2) -> person1.ageDifference(person2);

        people.stream().min(Person::ageDifference)
    	               .ifPresent(youngest -> System.out.println("Youngest: " + youngest));

        List<Person> ascendingAge = 
        	      people.stream()
        	            .sorted(compareAscending)
        	            .collect(toList());
        printPeople("Sorted in ascending order by age: ", ascendingAge);		  
        
    			  
        // convenience functions
        System.out.println("//" + "START:convenience functions");
        final Function<Person, String> byName = person -> person.getName();
        printPeople("Sorted in ascending order by age: ", people.stream().sorted(comparing(byName)).collect(toList()));
    	
        
	}
	
	public static void printPeople(
			    final String message, final List<Person> people) {
			      
			    System.out.println(message);
			    people.forEach(System.out::println);
	}
}
