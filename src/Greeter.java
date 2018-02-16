
public class Greeter {
	private String name;
	private int age;

	public Greeter() {
	    name="Astrid";
	    age=15; }

	public Greeter(String xName, int xAge) {
	    name=xName;
	    age=xAge; }
	public String toString() {
		return "Greeter: name: " + name + "age: "+ age;
	}
}
