package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndividualCustomer engin = new IndividualCustomer();
		engin.id = 2123;
		 
		CorparateCustomer hepsiburada = new CorparateCustomer();
		hepsiburada.id = 1133;
 
		AssocCustomer sorged = new AssocCustomer();
		sorged.id = 6250;
		
		CustomerManager customerManager = new CustomerManager();
		
		//customerManager.Add(engin);
		//customerManager.Add(sorged);
		//customerManager.Add(hepsiburada);
		
		Customer[] customers = new Customer[] {engin, hepsiburada, sorged};
		customerManager.addMultiple(customers);
		
		//FileLogger fl = new FileLogger();
 	}

}
