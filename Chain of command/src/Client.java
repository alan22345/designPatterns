import java.time.LocalDate;

public class Client {

	public static void main(String[] args) {
	   	LeaveApplication application = LeaveApplication.getBuilder().withType(LeaveApplication.Type.PTO)
				.from(LocalDate.now()).to(LocalDate.of(2023,4,5)).build();

		   LeaveApprover approver = createChain();
		   approver.processLeaveApp(application);
		   System.out.println(application);
	}

	private static LeaveApprover createChain(){
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead projectLead = new ProjectLead(manager);

		return projectLead;
	}
}
