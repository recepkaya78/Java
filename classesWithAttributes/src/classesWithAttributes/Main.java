package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Test", "Test1", 0, 0, "Test2");
		
//		product.setName( "Laptop");
//		product.setId(1);
//		product.setDescription("Asus Laptop Description");
//		product.setPrice(5000);
//		product.setStockAmount(3);
//		product.setRenk("Renk");

		// System.out.println(product.name);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());

//		productManager.Add2(1, "recep1", "test1", 3, 300, null);
//		productManager.Add2(2, "recep2", "test2", 3, 300, null);
//		productManager.Add2(3, "recep3", "test3", 3, 300, null);
//		productManager.Add2(4, "recep4", "test4", 3, 300, null);
//		productManager.Add2(5, "recep5", "test5", 3, 300, null);
	}

	public void Add2(int id, String name, String description, int stockAmount, double price, String yeniOzellik) {

	}
}
