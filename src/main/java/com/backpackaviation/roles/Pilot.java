package com.backpackaviation.roles;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pilot {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String name;
	private String phone;
	private String wingMake;
	private String wingModel;
	private String wingColors;
	private String inReachTrackingLink;
	private String spotTrackingLink;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWingMake() {
		return wingMake;
	}

	public void setWingMake(String wingMake) {
		this.wingMake = wingMake;
	}

	public String getWingModel() {
		return wingModel;
	}

	public void setWingModel(String wingModel) {
		this.wingModel = wingModel;
	}

	public String getWingColors() {
		return wingColors;
	}

	public void setWingColors(String wingColors) {
		this.wingColors = wingColors;
	}

	public String getInReachTrackingLink() {
		return inReachTrackingLink;
	}

	public void setInReachTrackingLink(String inReachTrackingLink) {
		this.inReachTrackingLink = inReachTrackingLink;
	}

	public String getSpotTrackingLink() {
		return spotTrackingLink;
	}

	public void setSpotTrackingLink(String spotTrackingLink) {
		this.spotTrackingLink = spotTrackingLink;
	}
	
	
}
