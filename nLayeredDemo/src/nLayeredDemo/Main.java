package nLayeredDemo;

import nLayeredDemo.business.Abstract.ProductService;
import nLayeredDemo.business.Concrate.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concrates.AbcProductDao;
 import nLayeredDemo.entities.concrates.Product;
 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//todo : sprimg ioc ile çözülecek
		ProductService productManager = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		
		Product product = new Product(1,2,"elma",1,4);
		productManager.add(product);
		
	}

}
