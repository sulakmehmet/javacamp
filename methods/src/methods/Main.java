package methods;

public class Main {

	public static void main(String[] args) {
		int sayi = topla(15, 7);
		System.out.println(sayi);
		int toplamlar = topla2(1, 4, 6, 9, 14);
		System.out.println(toplamlar);

	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;

		for (int sayi : sayilar) {
			toplam += sayi;
		}

		return toplam;
	}

}
