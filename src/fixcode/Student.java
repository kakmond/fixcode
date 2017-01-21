package fixcode;

//TODO Write class Javadoc
/**
 * A simple model for a Student.
 * 
 * @author Wongsathorn Panichkurkul
 */
public class Student extends Person {
	private long id;

	/**
	 * Initialize a student object.
	 * 
	 * @param name is the name of student
	 * @param id is the ID of student
	 */
	public Student(String name, long id) {
		super(name); // name is managed by Person class
		this.id = id;
	}

	/**
	 * Return a string representation of this Student.
	 * @return a string representation of this Student.
	 */
	public String toString() {
		return String.format("Student %s (%d)", getName(), id);
	}

	// TODO Fix the parameter!
	// TODO Write Javadoc and fix equals: two objects are equal if
	// TODO they are both Students, have same name, *and* have same id.
	// TODO Use the 4-step template for equals in the Fundamental Methods
	// handout.
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj.getClass() != this.getClass())
			return false;
		Student other = (Student) obj;
		return name.equalsIgnoreCase(other.name) && this.id == other.id;
		
	}

	/**
	 * get id of student
	 * 
	 * @return id of student
	 */
	public long getId() {
		return id;
	}

	/**
	 * Set or change the ID of student
	 * 
	 * @param id is the ID of student
	 */
	public void setId(long id) {
		this.id = id;
	}
}
