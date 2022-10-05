package OopwithNLayerdApp.dataAccess;

import OopwithNLayerdApp.entities.Product;

//implements polimorfik yapiyor
public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		//sadece ve sadece db erisim kodlari buraya yazilir. ... SQL
		System.out.println("JDBC ile veritabanina eklendi");
	}
}

//Hibernate