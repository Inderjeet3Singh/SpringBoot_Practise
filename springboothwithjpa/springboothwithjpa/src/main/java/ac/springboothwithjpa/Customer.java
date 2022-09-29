package ac.springboothwithjpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    
	@Id
	private int customerId;
	private int mobileNo;
	private String customerName;
	private String customerEmail;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public Customer(int customerId, int mobileNo, String customerName, String customerEmail) {
		super();
		this.customerId = customerId;
		this.mobileNo = mobileNo;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", mobileNo=" + mobileNo + ", customerName=" + customerName
				+ ", customerEmail=" + customerEmail + "]";
	}

}
