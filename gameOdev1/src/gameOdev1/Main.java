package gameOdev1;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer(1, "Mehmet", "Sulak", "12345678912", 1994);
		Campaign campaign1 = new Campaign("Ko� ko�", 25);
		
		SalesManager salesManger = new SalesManager();
		salesManger.sales(gamer1, campaign1);
		
		

	}

}
