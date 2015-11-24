
public class ReverseString extends StringDecorator {
	public ReverseString(StringInterface si) {
		original = si;
	}
	
	public String get() {
		int end = original.get().length() - 1;
		String answer = "";
		while (end >= 0) {
			answer += original.get().charAt(end);
			end--;
		}
		return answer;
	}
}
