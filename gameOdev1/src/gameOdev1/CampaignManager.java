package gameOdev1;

public class CampaignManager {
	
	public void add(Campaign campaign) {
		System.out.println(campaign.name + " kampanyası sisteme eklendi.");
	}
	
	public void update(Campaign campaign) {
		System.out.println(campaign.name + " kampanyası güncellendi.");
	}
	
	public void delete(Campaign campaign) {
		System.out.println(campaign.name + " kampanyası sistemden silindi.");
	}
	

}
