package com.andre.dcluster.model;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Transaction{

	@SerializedName("date")
	private String date;

	@SerializedName("amount")
	private BigDecimal amount;

	@SerializedName("detail")
	private String detail;
}