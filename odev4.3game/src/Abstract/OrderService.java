package Abstract;

import Entity.Campaign;
import Entity.Customer;
import Entity.Game;

public interface OrderService {
	void add(Customer customer, Game game, Campaign campaign);
	void delete(int campaignId);
	void update(int campaignId, Customer customer, Campaign campaign);
}
