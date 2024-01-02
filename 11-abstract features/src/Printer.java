
public class Printer extends DotMatrixPrinter implements Scanable{
	@Override
	public void scan() {
		System.out.println("Printer scan completed");
	}
}