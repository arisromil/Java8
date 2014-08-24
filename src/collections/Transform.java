package collections;

import static collections.Friends.friends;

public class Transform {

	public static void main(final String[] args) {
		 friends.stream()
         .map(name -> name.toUpperCase())
         .forEach(name -> System.out.print(name + " "));     
  
	}
	
}
