public class Client {

	public static void main(String[] args) throws InterruptedException {
		EWSService service = new EWSService();
		Command command = new AddMemberCommand("email","spam", service);
		MailTasksRunner.getInstance().addCommand(command);

		Thread.sleep(1000);

		MailTasksRunner.getInstance().shutdown();
	}

}
