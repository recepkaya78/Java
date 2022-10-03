package methodOverloading;

public class Main {
	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();

		// method overloding topla(int sayi1, int sayi2)
		dortIslem.topla(2, 3);
		System.out.println(dortIslem.topla(2, 3));

		// method overloding topla(int sayi1, int sayi2, int sayi3)
		// burada toplayi ayni isimde kullanabilirsin cunku atribut sayisi digerinden farkli
		dortIslem.topla(2, 3, 5);
		System.out.println(dortIslem.topla(2, 3, 5));

	}
}
