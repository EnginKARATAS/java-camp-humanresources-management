package Concrate;

import Abstract.ProductService;
import Entity.Game;

public class ProductManager implements ProductService {
	 
	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		System.out.println("oyun sisteme eklendi " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		System.out.println("oyun sistemden silindi " + game.getGameName());

	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		System.out.println("oyun güncellendi " + game.getGameName() );

	}

}
