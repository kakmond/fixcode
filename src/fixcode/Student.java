package fixcode;

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
	 * 
	 * @return a string representation of this Student.
	 */
	public String toString() {
		return String.format("Student %s (%d)", getName(), id);
	}

	/**
	 * two objects are equal if name and id are same
	 */
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
	 * @param id is the ID of student that you want to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	
}
