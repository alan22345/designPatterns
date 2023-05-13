//This represents a handler in chain of responsibility
public interface LeaveApprover {

    void processLeaveApp(LeaveApplication application);

    String getApprovalRole();

}
