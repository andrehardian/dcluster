package com.andre.dcluster.model;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Home{

	@SerializedName("lng")
	private double lng;

	@SerializedName("user_id")
	private String userId;

	@SerializedName("home_name")
	private String homeName;

	@SerializedName("lat")
	private double lat;
}