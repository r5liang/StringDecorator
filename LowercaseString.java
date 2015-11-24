
public class LowercaseString extends StringDecorator {
	public LowercaseString(StringInterface si) {
		original = si;
	}
	public String get() {
		return original.get().toLowerCase();
	}
}
