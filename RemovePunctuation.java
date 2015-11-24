
public class RemovePunctuation extends StringDecorator {
	public RemovePunctuation(StringInterface si) {
		original = si;
	}
	public String get() {
		return original.get().replaceAll("[^a-zA-Z0-9 ]", "");
	}
}
