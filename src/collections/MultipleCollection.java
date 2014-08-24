package collections;

import java.util.function.Predicate;
import static collections.Friends.friends;
import static collections.Friends.himym;

public class MultipleCollection {
	
	public static void main(final String[] args) {
		final Predicate<String> startsWithR = name -> name.startsWith("R");
		
	    final long countFriendsStartR = 
	      friends.stream()
	             .filter(startsWithR)
	             .count();
	    final long countHIMYMStartR =	    		
	      himym.stream()
	             .filter(startsWithR)
	             .count();

	    System.out.println(countFriendsStartR);
	    System.out.println(countHIMYMStartR);
	}

}
