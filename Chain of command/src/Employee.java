//Abstract handler
public abstract class Employee implements LeaveApprover {

    private String role;

    private LeaveApprover successor;
    public Employee(String role, LeaveApprover successor) {
        this.role = role;
        this.successor = successor;
    }

    @Override
    public void processLeaveApp(LeaveApplication application) {
        if(!processRequest(application) && successor != null){
            successor.processLeaveApp(application);
        }
    }

    protected abstract boolean processRequest(LeaveApplication application);


    @Override
    public String getApprovalRole() {
        return role;
    }
}