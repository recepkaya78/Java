
public class Main {

	public static void main(String[] args) {

		// class lar referans type dir.
		CustomerManager customerManeger = new CustomerManager();
		CustomerManager customerManeger2 = new CustomerManager();
		customerManeger = customerManeger2;

		customerManeger.Add();
		customerManeger.Remove();
		customerManeger.Update();

		// value
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2); // ? 10

		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 4, 5, 6 };
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
	}

//	public class CustomerManager {}

}
