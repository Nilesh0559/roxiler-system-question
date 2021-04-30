package com.app.dto;

import org.springframework.stereotype.Component;

@Component
public class Quote {
	private String cover;
	private double carQuote;
	private String provider;
	private String vehicleMake;
	private String quoteCurrency;
	private String 	currencySymbol;
	
	public Quote() {
		// TODO Auto-generated constructor stub
	}

	public Quote(String cover, double carQuote, String provider, String vehicleMake, String quoteCurrency,
			String currencySymbol) {
		super();
		this.cover = cover;
		this.carQuote = carQuote;
		this.provider = provider;
		this.vehicleMake = vehicleMake;
		this.quoteCurrency = quoteCurrency;
		this.currencySymbol = currencySymbol;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public double getCarQuote() {
		return carQuote;
	}

	public void setCarQuote(double carQuote) {
		this.carQuote = carQuote;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getVehicleMake() {
		return vehicleMake;
	}

	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	public String getQuoteCurrency() {
		return quoteCurrency;
	}

	public void setQuoteCurrency(String quoteCurrency) {
		this.quoteCurrency = quoteCurrency;
	}

	public String getCurrencySymbol() {
		return currencySymbol;
	}

	public void setCurrencySymbol(String currencySymbol) {
		this.currencySymbol = currencySymbol;
	}

	@Override
	public String toString() {
		return "Quote [cover=" + cover + ", carQuote=" + carQuote + ", provider=" + provider + ", vehicleMake="
				+ vehicleMake + ", quoteCurrency=" + quoteCurrency + ", currencySymbol=" + currencySymbol + "]";
	}
	
}
