//A concrete handler
public class ProjectLead extends Employee {

    public ProjectLead(LeaveApprover successor) {
        super("Project Lead" ,successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        // type is sick leave and duration is less than or equal to 2 days
        if(application.getType() == LeaveApplication.Type.Sick){
            if(application.getNoOfDays() <= 2){
                application.approve(getApprovalRole());
                return true;
            }
        }
        return false;
    }
}
