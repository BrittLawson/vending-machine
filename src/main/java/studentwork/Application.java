package studentwork;

public class Application {

	public static void main(String[] args) {

		VendingMachine vendingMachine = new VendingMachine();
		UI ui = new UI(vendingMachine);

	}
}
