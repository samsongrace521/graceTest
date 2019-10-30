package com.vv.spring.helloworld.domain;

public class Bean {

	private String siteName;
	private String county;
	private String status;
	private String pm25;
	private String pm25AVG;
	private String publishTime;
	private String longitude;
	private String latitude;

	public Bean() {

	}

	public Bean(String siteName) {
		this.siteName = siteName;
	}

	public Bean(String siteName, String county, String status, String pm25AVG, String publishTime, String longitude, String latitude) {
		this.siteName = siteName;
		this.county = county;
		this.status = status;
		this.pm25AVG = pm25AVG;
		this.publishTime = publishTime;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPm25AVG() {
		return pm25AVG;
	}

	public void setPm25AVG(String pm25avg) {
		pm25AVG = pm25avg;
	}

	public String getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getPm25() {
		return pm25;
	}

	public void setPm25(String pm25) {
		this.pm25 = pm25;
	}

}