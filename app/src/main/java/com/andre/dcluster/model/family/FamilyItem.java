package com.andre.dcluster.model.family;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class FamilyItem{

	@SerializedName("no_ktp")
	private String noKtp;

	@SerializedName("name")
	private String name;

	@SerializedName("type")
	private String type;
}