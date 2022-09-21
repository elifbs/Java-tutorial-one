package javaegitimiödev1;

public class main {

	public static void main(String[] args) {
		
		System.out.println("Hello World...!");	
		
		int ogrenciSayisi = 100;
		String mesaj = "Öğrenci Sayısı : ";
		
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println("---------------");
		
		int sayi = 250;
		
		if (sayi < 250){
			System.out.println("Sayı 250'den KüÇüKTüR...!");
		}else if (sayi > 250){
			System.out.println("Sayı 250'den BüYüKTüR...!");
		}else{
			System.out.println("Sayı 250'ye EŞiTTiR...!");
		}
		System.out.println("---------------");
		
		//Demo 1 : İf Blokları
		
		int sayi1 = 200;
		int sayi2 = 100;
		int sayi3 = 55;
		int enBuyuk = sayi1;
		
		if (enBuyuk < sayi2){
			enBuyuk = sayi2;
		}
		if (enBuyuk < sayi3){
			enBuyuk = sayi3;
		}
		System.out.println("En büyük sayı : " + enBuyuk);
		System.out.println("---------------");
		
		//Switch : 
				
		char grade = 'F'  ;
				
		switch (grade){
			case 'A': 
				System.out.println("Mükemmel : Geçtiniz...!");
				break;
			case 'B': 
				System.out.println("Çok iyi : Geçtiniz...!");
				break;
			case 'C': 
				System.out.println("İyi : Geçtiniz...!");
				break;
			case 'D': 
				System.out.println("Fena değil : Geçtiniz...!");
				break;
			case 'F': 
				System.out.println("Kaldınız...!");
				break;
			default:
				System.out.println("Geçersiz not girdiniz...!");
		}
		System.out.println("---------------");
		
		// Döngüler : For Döngüsü		
		for (int i=1; i<=20; i++){
			System.out.println(i);
		}
		System.out.println("Döngü bitmiştir...(1)!");
		System.out.println("---------------");
				
		// Döngüler : While Döngüsü		
		int i = 1;
		while (i<10){			
			System.out.println(i);
			i++;
		}
		System.out.println("Döngü bitmiştir...(2)!");
		System.out.println("---------------");
		
		// Döngüler : Do-While Döngüsü			
		int j = 1;
		do {
			System.out.println(j);
			j+=3;
		} while(j<10);
		System.out.println("Döngü bitmiştir...(3)!");
		System.out.println("----------------");
		
		//Diziler :
		
		String name1 = "Elif";
		String name2 = "Yunus";
		String name3 = "Alya";
		String name4 = "Nehir";
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);		
		System.out.println("---------------");
		
		String[] name = new String[4];
		name [0] = "Elif";
		name [1] = "Yunus";
		name [2] = "Alya";
		name [3] = "Nehir";
		for(int l=0;l<name.length;l++){
			System.out.println(name[l]);
		}
		System.out.println("---------------");
		
		for(String isim:name){
			System.out.println(isim);
		}
		System.out.println("---------------");
		
		//Demo : Diziler
		double[] numbers = {0.1, 9.2, 2.5, 3.8, 8.9};
		double max = numbers[0];
		double total = 0;
		for (double number : numbers){
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplamları : " + total);
		System.out.println("En Büyük Sayı : " + max);
		System.out.println("---------------");
		
		// Çok boyutlu diziler : 
		int [] [] tekCiftSayilar = new int [2] [2];
		
		tekCiftSayilar [0][0] = 1;
		tekCiftSayilar [0][1] = 3;
		tekCiftSayilar [1][0] = 2;
		tekCiftSayilar [1][1] = 4;
		
		for (int b=0; b<=1; b++) {			
			System.out.println("**************");
			for (int n=0; n<=1; n++) {				
				System.out.println(tekCiftSayilar[b][n]);
			}
		}
		System.out.println("---------------");
		
		// String :
		String metin = "Hava güneşli.";
		System.out.println(metin);
		System.out.println("Karakter sayısı : " + metin.length());
		System.out.println("6. Karakter : " + metin.charAt(5));
		System.out.println("Metne yeni bir metin ekleme/birleştirme : " + metin.concat(" Yarın nasıl olabilir."));
		System.out.println(metin.startsWith("H"));
		System.out.println(metin.startsWith("h"));
		System.out.println(metin.endsWith("."));
		
		System.out.println("---------------");
		
		char[] karakter = new char[5];
		metin.getChars(0, 5, karakter, 0);
		System.out.println(karakter);
		System.out.println(metin.indexOf("a"));
		System.out.println(metin.lastIndexOf("a")); //Dikkat : sondan başa dogru karakteri arar ancak baştan saymaya başlar
		
		System.out.println("---------------");
		
		System.out.println(metin.replace("a", "*"));
		String yeniMetin = metin.replace(" ", "-");
		System.out.println(yeniMetin);
		System.out.println(metin.substring(4, 8));

		for (String kelime : metin.split(" ")){			
			System.out.println(kelime);
		}
		
		System.out.println(metin.toLowerCase());
		System.out.println(metin.toUpperCase());
		System.out.println(metin.trim()); //Boşlukları yok eder.
		
		//Demo 1 : Asal sayı mı?.	
		
		int sayilar = -6;
		int kalan = sayilar % 2;
		System.out.println(kalan);
		boolean isPrime = true;
		
		if (sayilar == 1){
			System.out.println("Sayı asal değildir...!");
		}
		if (sayilar < 1){
			System.out.println("Geçersiz sayı girdiniz...!");
		}
		
		for (int t=2; t<sayilar; t++){			
			if (sayilar % t == 0){
				isPrime = false;
			}
		}
		if (isPrime){
			System.out.println("Sayı asaldır...!");
		}else {
			System.out.println("Sayı asal değildir...!");
		}
		
		// Demo 2 : ince-kalın sesli harf mi? 
		
		char harf = 'K';
		
		switch (harf){
			case 'A' : 
			case 'I' : 
			case 'O' : 
			case 'U' : 	
				System.out.println("Kalın sesli harf!");
				break;
			case 'E' : 
			case 'İ' :
			case 'Ö' : 
			case 'Ü' : 
				System.out.println("İnce sesli harf!");
				break;
			default:
				System.out.println("Sessiz harf!");
		}
		
		// DEMO 3 : Mükemmel sayı mı?
		
		int number = 28;
		int toplam = 0;
		
		for (int p=1; p<number; p++){
			if (number % p == 0){
				toplam = toplam + p;
			}			
		}
		if (toplam == number){
			System.out.println("Mükemmel sayı!.");
		}else {
			System.out.println("Mükemmel sayı değildir!.");
		}
		
		// DEMO 4 : Arkadaş sayılar!
		
		int number1 = 220;
		int number2 = 284;
		int total1 = 0;
		int total2 = 0;
		
		for (int y=1; y<number1; y++){			
			if (number1 % y == 0){
				total1 = total1 + y;
			}
		}		
		for (int y=1; y<number2; y++){			
			if (number2 % y == 0){
				total2 = total2 + y;
			}
		}
		
		if (total1 == number2 && total2 == number1){
			System.out.println("Arkadaş sayı!");
		}else {
			System.out.println("Arkadaş sayı değildir.!");
		}
		
		// DEMO 5 : Sayı bulma
		
		int[] rakamlar = new int[] {1,2,5,7,9,0};
		int aranacak = 15;
		boolean varMi = false;
		
		for (int rakam : rakamlar){
			if (rakam == aranacak){
				varMi = true;
				break;
			}			
		}		
		if (varMi){
			System.out.println("Rakam mevcuttur.");
		}else {
			System.out.println("Rakam mevcut değildir.");
		}

	}

}
