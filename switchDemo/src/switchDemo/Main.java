package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {

		case 'A':
			System.out.println("M�kemmel: Ge�tiniz");
			break;
		case 'B': // B ve C' nin ��kt�s� ayn� olacakt�r.
		case 'C':
			System.out.println("�yi: Ge�tiniz");
			break;
		case 'D':
			System.out.println("Fena de�il: Ge�tiniz");
			break;
		case 'F':
			System.out.println("�ok K�t�: Kald�n�z");
			break;
		default:
			System.out.println("Ge�ersiz not girdiniz.");
		}

	}

}
