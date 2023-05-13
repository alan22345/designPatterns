
/**
 * A class adapter, works as Two-way adapter
 * THIS IS A BAD WAY BETTER TO USE OBJECT ADAPTER BECAUSE IT DECREASES DEPENDENCY ON CUSTOMER
 */


public class EmployeeClassAdapter extends Employee implements Customer{

	@Override
	public String getName() {
		return this.getFullName();
	}

	@Override
	public String getDesignation() {
		return this.getJobTitle();
	}

	@Override
	public String getAddress() {
		return this.getOfficeLocation();
	}
	
}
