package inheritance2;

public class CustomerManager {
	//parametresiz versyonuda yapýlabilir
	public void add(Logger logger) {
		System.out.println("customer eklendi");
		logger.log();
	}
}
