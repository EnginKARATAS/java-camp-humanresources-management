
import Abstract.ProductService;
import Concrate.CustomerManager;
import Concrate.EStateCheckService;
import Concrate.OrderManager;
import Concrate.ProductManager;
import Entity.Campaign;
import Entity.Customer;
import Entity.Game;

public class Main {

	public static void main(String[] args) {
		//Entities
		Customer player1 = new Customer();
		player1.setId(0);
		player1.setFirstName("engin");
		player1.setLastName("Karatas");
		
		Game game1 = new Game();
		game1.setId(0);
		game1.setGameName("The Long Dark");
		Game game2 = new Game();
		game2.setId(1);
		game2.setGameName("Torchlight 2");
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(0);
		campaign1.setAmount(20);
		
		 CustomerManager customerManager = new CustomerManager(new EStateCheckService());
	    customerManager.add(player1);
		customerManager.delete(player1);
		customerManager.update(player1);
		
		ProductService productManager  = new ProductManager();
		productManager.add(game1);
 		productManager.delete(game2);
		productManager.update(game2);

		OrderManager orderManager = new OrderManager();
		orderManager.add(player1, game1, campaign1);
		orderManager.delete(32);
		orderManager.update(0, player1, campaign1);
		
		
		
		 
		
		
		
		
		

	}

}
