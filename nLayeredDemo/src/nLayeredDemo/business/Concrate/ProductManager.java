package nLayeredDemo.business.Concrate;

import java.util.List;

import nLayeredDemo.business.Abstract.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concrates.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao;
	private LoggerService loggerService;

	
	
 
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		if (product.getCategory() == 1) {
			return; //boþ return kodu daha fazla okumaz aþþaðya inmez anlamýnda
		}
		this.productDao.add(product);
		this.loggerService.logToSystem("loglandý ");
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
