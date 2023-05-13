import java.io.IOException;

public class Client {

	public static void main(String[] args) throws IOException {
		Order order = new Order("1001");

		order.addItem("item", 2.5);
		order.addItem("notjing",0.01);

		OrderPrinter printer = new TextPrinter();
		printer.printOrder(order,"textorinte.txt");
	}
}
