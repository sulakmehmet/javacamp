package gameOdev1;

public class CampaignManager {
	
	public void add(Campaign campaign) {
		System.out.println(campaign.name + " kampanyasý sisteme eklendi.");
	}
	
	public void update(Campaign campaign) {
		System.out.println(campaign.name + " kampanyasý güncellendi.");
	}
	
	public void delete(Campaign campaign) {
		System.out.println(campaign.name + " kampanyasý sistemden silindi.");
	}
	

}
