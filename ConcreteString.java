
public class ConcreteString implements StringInterface {
	private String string;
	public ConcreteString(String s) {
		string = s;
	}
	public String get() {
		return string;
	}
}
