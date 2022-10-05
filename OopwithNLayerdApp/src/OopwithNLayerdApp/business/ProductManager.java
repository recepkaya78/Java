package OopwithNLayerdApp.business;

import java.util.Iterator;
import java.util.List;

import OopwithNLayerdApp.core.logging.Logger;
import OopwithNLayerdApp.dataAccess.ProductDao;
import OopwithNLayerdApp.entities.Product;

public class ProductManager {

	private ProductDao productDao;
	private Logger[] loggers;

	//Bagimlilik enjeksiyonu
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		// business logic/ is kurallari
		if (product.getUnitPrice() < 10) {
			throw new Exception("Urun fiyati 10 dan kucuk olamaz.!!!");
		}
//	  	HibernateProductDao productDao = new HibernateProductDao();
		productDao.add(product);
		
		for (Logger logger : loggers) { // db, mail 
			logger.log(product.getName());			
		}
	}
}
