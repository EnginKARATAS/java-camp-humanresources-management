import Abstract.BaseCustomerService;
import Adapters.MernisServiceAdapter;
import Concrate.CustomerCheckManager;
import Concrate.SturbucksCustomerService;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerService customerService = new SturbucksCustomerService(new MernisServiceAdapter());
		
		Customer engin = new Customer();
		engin.setFirstName("ENGIN");
		
		customerService.save(engin);
	}

}
