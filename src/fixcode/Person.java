package fixcode;

/**
 * A simple model for a person with a name.
 * 
 * @author Wongsathorn Panichkurkul
 */
// TODO Complete the missing Javadoc.
// TODO Fix bad Javadoc tags and poorly written Javadoc.
// TODO Make sure methods have @param and @return tags (if they return
// something)
// TODO Remove all the "TODO" comments after you do them.
// TODO Fix coding errors.
public class Person {
	/** the person's full name. */
	public String name;

	/**
	 * Initialize a new Person object.
	 */
	public Person(String name) {
		this.name = name;
	}

	/**
	 * Get the person's name.
	 * 
	 * @return the name of person
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set or change the person's name.
	 * 
	 * @param newname is the name that you want to change or set
	 */
	public void setname(String newname) {
		this.name = newname;
	}

	/**
	 * Compare person's by name. They are equal if the name matches.
	 * 
	 * @param other is another Person to compare to this one.
	 * @return true if the name is same, false otherwise.
	 */
	public boolean equals(Object other) {
		// TODO After running the test program (Main), fix this method.
		// TODO Use the 4-step template for equals in the Fundamental Methods
		// handout.
		if (other == null)
			return false;
		if (other.getClass() != this.getClass())
			return false;
		Person obj = (Person) other;
		if (name.equalsIgnoreCase(obj.name))
			return true;
		return false;
	}

	/**
	 * Get a string representation of this Person.
	 * @return a string representation of this Person.
	 */
	public String toString() {
		return "Person " + name;
	}
}
