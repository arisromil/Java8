package collections;

import static collections.Friends.friends;

import java.util.function.Consumer;

public class Iteration {

	public static void main(final String[] args) {
		friends.forEach(new Consumer<String>() {
		      public void accept(final String name) {
		        System.out.println(name);
		      }
		    });	
	}
	 
}
