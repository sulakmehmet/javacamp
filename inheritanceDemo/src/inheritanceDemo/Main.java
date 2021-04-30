package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
//		KrediUI krediUI = new KrediUI();
//		krediUI.krediHesapla(new TarimKrediManager());

		BaseKrediManager[] krediManagers = new BaseKrediManager[] 
				{ new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager() };

		for (BaseKrediManager krediManager : krediManagers) {
			System.out.println(krediManager.hesapla(1000));
		}

	}

}
