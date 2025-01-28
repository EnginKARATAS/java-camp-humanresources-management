package interfaces;

public class CustomerManager {
	Logger[] loggers;
	
	public CustomerManager(Logger[] logger){
		this.loggers = logger;
	}
	public void add(Customer customer) {
		 
			System.out.println("müþteri eklendi " + customer);
			 
			Utils.runLoggers(loggers, "eklendi");
				
	 
	}
	
	public void delete(Customer customer){
		//Utils.runLoggers(loggers, "silindi");
	}
}
