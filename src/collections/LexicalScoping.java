package collections;

import java.util.function.Function;
import java.util.function.Predicate;
import static collections.Friends.friends;

public class LexicalScoping {

	public static void main(final String[] args) {
		final Function<String, Predicate<String>> startsWithLetter = 
			      letter -> name -> name.startsWith(letter);

			    final long countFriendsStartM =
			      friends.stream()
			             .filter(startsWithLetter.apply("M")).count();
			    
			    final long countFriendsStartR =			    		
			      friends.stream()
			             .filter(startsWithLetter.apply("R")).count();


			    System.out.println(countFriendsStartM);
			    System.out.println(countFriendsStartR);
	}
}
