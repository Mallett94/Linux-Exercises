import java.util.ArrayList;

public class Boat implements Vehicle { //the boat class implements my vehicle interface. This means that my Boat must follow all of the methods within the Vehicle interface
	
	protected String name;
	protected String origin;
	protected double size;
	protected ArrayList<Person> people = new ArrayList<Person> (); //creates an Arraylist to store people associated with the boat
	
	
	public Boat(String name, String origin, double size) {
		this.name = name;
		this.origin = origin;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
	public String toString() { //method to format the data
		return "Name: " + this.name + ". Country of origin: " + this.origin + ". Boat size: " + this.size + " units.\n ";
		
	}
	/*							not sure how to get speed??
	public int getSpeed() {
		return getSpeed();
	}
	*/
	public void accelerate() {
		System.out.println("The boat is accelerating!");
	}
	
	public void deccelerate() {
		System.out.println("The boat is deccelerating!");
	}
	@Override
	public int getSpeed() {
		return 0;
	}
	
	public void hasPerson(Person role){ //method to add a person to the people ArrayList
		this.people.add(role);
	}
	
	
}
