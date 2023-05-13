public class Client {

	public static void main(String[] args) {

		// normal implementation
		ComplexService service = new ComplexService("Simple report",new StorageService());
		service.generateReport();

		// null object
		ComplexService service2 = new ComplexService("Simple report2",new NullStorageService());
		service.generateReport();

	}

}
