package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
			System.out.println(customer.id + "`li customer eklendi");
	}
	
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer:customers)
			add(customer);
	}

}
