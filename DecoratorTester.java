
public class DecoratorTester {

	public static void main(String[] args) {

		StringDecorator test5 = new CapitalizedString(new ReverseString(new ConcreteString("fADSFDSFSF,4324!")));
		StringDecorator test6 = new ReverseString(new LowercaseString(new ConcreteString("fADSFDSFSF,4324!")));
		StringDecorator test7 = new CapitalizedString(new RemovePunctuation(new ConcreteString("fADSFDSFSF,4324!")));
		
		System.out.println(test5.get() + "\n" + test6.get() + "\n" + test7.get() + "\n");
	}

}
