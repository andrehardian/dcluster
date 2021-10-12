package com.andre.dcluster.model.family;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Family{

	@SerializedName("user_id")
	private String userId;

	@SerializedName("family")
	private List<FamilyItem> family;
}