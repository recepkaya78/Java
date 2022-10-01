
public class Main {

	public static void main(String[] args) {
		
		//class lar referans type dir.
		CustomerManager customerManeger = new CustomerManager();
		CustomerManager customerManeger2 = new CustomerManager();
		customerManeger = customerManeger2;
		
		customerManeger.Add();
		customerManeger.Remove();
		customerManeger.Update();
	}

//	public class CustomerManager {}

}
