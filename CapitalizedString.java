
public class CapitalizedString extends StringDecorator {
	public CapitalizedString(StringInterface si) {
		original = si;
	}
	public String get() {
		return original.get().toUpperCase();
	}
}
