
public class Main {
	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.Hesapla();
		
		KrediUI krediUI =new KrediUI();
		//Bu ornek Polimorfizmin kendisidir
		krediUI.KrediHesapla(new AskerKrediManager());
	}
}