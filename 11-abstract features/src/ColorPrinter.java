
public class ColorPrinter implements ColorScanable {
	@Override
	public void scan() {
		System.out.println("ColorPrinter black and white scan done");
	}

	@Override
	public void colorScan() {
		System.out.println("ColorPrinter Color scan done");
	}

}