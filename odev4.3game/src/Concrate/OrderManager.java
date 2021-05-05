package Concrate;

import Abstract.OrderService;
import Entity.Campaign;
import Entity.Customer;
import Entity.Game;

public class OrderManager implements OrderService{

	@Override
	public void add(Customer customer, Game game, Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName() + " oyununu " + campaign.getAmount() + " indirim ile satın aldınız sn. " + customer.getFirstName() + " " + customer.getLastName());
	}

	@Override
	public void delete(int campaignId) {
		// TODO Auto-generated method stub
		System.out.println(campaignId + " nolu siparişinizi sildiniz");
		
	}

	@Override
	public void update(int campaignId, Customer customer, Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaignId + " numaralı" + campaign.getAmount() +" indirimli oyununuzun bilgileri güncellenmiştir sn." + customer.getFirstName() + " " + customer.getLastName());
	} 

}
