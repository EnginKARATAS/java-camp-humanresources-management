package interfaces;

public class CustomerManager {
	Logger[] loggers;
	
	public CustomerManager(Logger[] logger){
		this.loggers = logger;
	}
	public void add(Customer customer) {
		for(Logger log : loggers) {
			System.out.println("müþteri eklendi " + customer);
			log.log("Musteri " + customer.getFirstName());	
		}
	}
	
	public void delete(Customer customer) {
		for(Logger log : loggers) {
			System.out.println("müþteri eklendi " + customer);
 		}	
		}
}
