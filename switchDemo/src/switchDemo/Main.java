package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {

		case 'A':
			System.out.println("Mükemmel: Geçtiniz");
			break;
		case 'B': // B ve C' nin çýktýsý ayný olacaktýr.
		case 'C':
			System.out.println("Ýyi: Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena deðil: Geçtiniz");
			break;
		case 'F':
			System.out.println("Çok Kötü: Kaldýnýz");
			break;
		default:
			System.out.println("Geçersiz not girdiniz.");
		}

	}

}
