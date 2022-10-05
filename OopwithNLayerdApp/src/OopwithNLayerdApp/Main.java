package OopwithNLayerdApp;

import OopwithNLayerdApp.business.ProductManager;
import OopwithNLayerdApp.core.logging.DatabaseLogger;
import OopwithNLayerdApp.core.logging.FileLogger;
import OopwithNLayerdApp.core.logging.Logger;
import OopwithNLayerdApp.core.logging.MailLogger;
import OopwithNLayerdApp.dataAccess.HibernateProductDao;
import OopwithNLayerdApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(123, "telefoon", 11);

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);
	}
}
