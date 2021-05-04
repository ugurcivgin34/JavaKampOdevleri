package Entities.Concrete;

import Entities.Abstract.Entity;

public class Campaign implements Entity {
	private int id;
	private String campaignName;
	private int campaignPrice;

	public Campaign() {

	}

	public Campaign(int id, String campaignName, int campaignPrice) {
		this();
		this.id = id;
		this.campaignName = campaignName;
		this.campaignPrice = campaignPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getCampaignPrice() {
		return campaignPrice;
	}

	public void setCampaignPrice(int campaignPrice) {
		this.campaignPrice = campaignPrice;
	}
}
