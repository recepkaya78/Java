package oop1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mesaj = "Vade orani";
		// yazmak icin set. okumak icin get yapiyoruz.

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinasi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("Image1.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinasi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("Image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Kahve Makinasi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("Image3.jpg");

		// set value
		// product1.name = "Delonghi Kahve Makinasi";
		// product1.unitPrice = 7500;
		// product1.discount = 7;
		// product1.unitsInStock = 3;
		// product1.imageUrl = "Test1.jpg";

		// Product product2 = new Product();
		// set value
		// product2.name = "Smeg Kahve Makinasi";
		// product2.unitPrice = 6500;
		// product2.discount = 7;
		// product2.unitsInStock = 3;
		// product2.imageUrl = "Test2.jpg";

		// Product product3 = new Product();
//set value
		// product3.name = "Kitchen Kahve Makinasi";
		// product3.unitPrice = 4500;
		// product3.discount = 7;
		// product3.unitsInStock = 3;
		// product3.imageUrl = "Test3.jpg";

		// Array
		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");

		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		// get
		// System.out.println(product1.name);
		
		IndividualCustomer individualCustomer = new  IndividualCustomer();		
		individualCustomer.setId(1);		
		individualCustomer.setPhone("+31 619204547");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Recep");
		individualCustomer.setLastName("Kaya");
		
		
		CorporateCustomer corporateCustomer = new  CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("+31 619204547");
		corporateCustomer.setTaxNumber("222222222");
		corporateCustomer.setCustomerNumber("1234567");
		
		Customer[]customers =  {individualCustomer,corporateCustomer};
		
		for (Customer customer : customers) {
			System.out.println(customer.getCustomerNumber()); //getFirstName ?
		}
	}
}
