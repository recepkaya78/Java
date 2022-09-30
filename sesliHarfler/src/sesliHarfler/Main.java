package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'I';
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalin sesli harfler");
			break;
		default:
			System.out.println("Ince sesli harfler");
		}

	}

}
