//A Concrete implementation of Command.
public class AddMemberCommand implements Command {

    private String emailAddress;
    private String listName;
    private EWSService receiver;

    public AddMemberCommand(String emailAddress, String listName, EWSService receiver) {
        this.listName = listName;
        this.emailAddress = emailAddress;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.addMember(emailAddress, listName);
    }
}
