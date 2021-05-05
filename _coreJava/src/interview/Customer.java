package interview;

public class Customer {
	private String cid;
	private String customerName;
	private String Address;
	
	public Customer(String cid, String customerName, String address) {
		super();
		this.cid = cid;
		this.customerName = customerName;
		Address = address;
		System.out.println("objects Initiallized"+this.toString());
	}

	public String getCid() {
		return cid;
	}
	
	public void setCid(String cid) {
		this.cid = cid;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String address) {
		Address = address;
	}

	public boolean equals(Object that){
		if(that == null || getClass()!=that.getClass()){
			return false;
		}
		if(this == that){
			return true;
		}
		Customer customer=(Customer)that;
			return this.getCid() == customer.getCid();
	}
		
}
