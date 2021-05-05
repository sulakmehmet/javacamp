package gameOdev1;

public class GamerManager {

	private GamerCheckManager gamerCheckManager;

	public void save(Gamer gamer) {
		if (gamerCheckManager.checkIfRealGamer(gamer)) {
			System.out.println(gamer.firstName + " oyuncu sisteme kaydedildi.");
		}
	}

	public void update(Gamer gamer) {
		System.out.println(gamer.firstName + " oyuncu bilgileri güncellendi.");
	}

	public void delete(Gamer gamer) {
		System.out.println(gamer.firstName + " oyuncu sistemden silindi.");
	}

}
