package com.andre.dcluster.model;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class User{
	@SerializedName("no_hp")
	private String noHp;

	@SerializedName("gender")
	private String gender;

	@SerializedName("no_ktp")
	private String noKtp;

	@SerializedName("name")
	private String name;
}