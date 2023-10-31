package com.nt.sbaens;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("pmenu")

@Data
public class MenuPrice {
	
	@Value("${menu.dosarate}")
	private float DosaPrice;
	@Value("${menu.bondarate}")
	private float BondaPrice;
	@Value("${menu.purirate}")
	private float PuriPrice;
	
	
	public float getDosaPrice() {
		return DosaPrice;
	}


	public void setDosaPrice(float dosaPrice) {
		DosaPrice = dosaPrice;
	}


	public float getBondaPrice() {
		return BondaPrice;
	}


	public void setBondaPrice(float bondaPrice) {
		BondaPrice = bondaPrice;
	}


	public float getPuriPrice() {
		return PuriPrice;
	}


	public void setPuriPrice(float puriPrice) {
		PuriPrice = puriPrice;
	}


	@Override
	public String toString() {
		return "MenuPrice [DosaPrice=" + DosaPrice + ", BondaPrice=" + BondaPrice + ", PuriPrice=" + PuriPrice + "]";
	}

	

}
