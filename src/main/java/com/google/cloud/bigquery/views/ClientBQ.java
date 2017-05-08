package com.google.cloud.bigquery.views;

public class ClientBQ {

	private String campaign_id;
	private int impressions;
	private int clicks;
	private int conversions;
	private float conversion_inr;
	private int status;

	public String getCampaign_id() {
		return campaign_id;
	}

	public void setCampaign_id(String campaign_id) {
		this.campaign_id = campaign_id;
	}

	public int getImpressions() {
		return impressions;
	}

	public void setImpressions(int impressions) {
		this.impressions = impressions;
	}

	public int getClicks() {
		return clicks;
	}

	public void setClicks(int clicks) {
		this.clicks = clicks;
	}

	public int getConversions() {
		return conversions;
	}

	public void setConversions(int conversions) {
		this.conversions = conversions;
	}

	public float getConversion_inr() {
		return conversion_inr;
	}

	public void setConversion_inr(float conversion_inr) {
		this.conversion_inr = conversion_inr;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getString() {
		return "ClientBQ [campaign_id=" + campaign_id + ", impressions=" + impressions + ", clicks=" + clicks
				+ ", conversions=" + conversions + ", conversion_inr=" + conversion_inr + ", status=" + status + "]";
	}

}