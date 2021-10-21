package collectionFramework;

public class GenericPrinterTest2 {

	public static void main(String[] args) {
		// <T extends 클래스> 테스트
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		powderPrinter.setMaterial(new Powder()); // new Powder()??
		Powder powder = powderPrinter.getMaterial();
		
		powderPrinter.printing();
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		
		plasticPrinter.setMaterial(new Plastic()); // new Plastic()??
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		
		plasticPrinter.printing();

	}

}
