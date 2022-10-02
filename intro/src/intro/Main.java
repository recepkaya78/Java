package intro;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		String ortaMetin = "Ilginizi cekebilir";
		String altMetin = "Vade suresi";
		int vade = 12;
		
		String vade1 = "12";
		
		//Wrapper class pars to integer
		Integer a = Integer.parseInt(vade1); 
		System.out.println(a);
		
		double dolarDun = 18.25;
		double dolarBugun = 18.30;
		boolean dolarDustuMu = true;
		
		String okYonu = "";
		
		System.out.println(ortaMetin);
		System.out.println(altMetin);
		System.out.println(altMetin);

	 if (dolarBugun<dolarDun) {//true
		 okYonu = "down.svg";
		System.out.println(okYonu);
	} else if(dolarBugun>dolarDun) {
		okYonu = "up.svg";
		System.out.println(okYonu);
	}
	else {
		okYonu = "equal.svg";
		System.out.println(okYonu);
	}
	 //array
	 String[] krediler = {"Hizli krediler","Maasi halkbanktan","Mutlu emekli","Hizli krediler","Maasi halkbanktan","Mutlu emekli","Hizli krediler","Maasi halkbanktan","Mutlu emekli"};
	 
	 // System.out.println(krediler[0]);
	 // System.out.println(krediler[1]);
	 // System.out.println(krediler[2]);
	 
	 for (int i = 0; i < krediler.length; i++) {
		 System.out.println(krediler[i]);		
	}
	 
	
	 
	 
	 
	
		 

	 
	}
}
