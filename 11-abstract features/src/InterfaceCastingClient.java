
public class InterfaceCastingClient {
	public static void main(String[] args) {
		// upcast
		Scanable scanner = new TestPrinter();
		scanner.scan();

		scanner = new Printer();
		scanner.scan();

		// downcast
		Printer printer = (Printer) scanner;
		printer.print();

	}

}