package by.bsuir.substances.headdress;

import by.bsuir.substances.Cloth;

public abstract class Headdress extends Cloth {
	private String cling;//облегание (плотно, средне, нормально)
	private String earsHide;

	public String getCling() {
		return cling;
	}

	public void setCling(String cling) {
		this.cling = cling;
	}

	public String getEarsHide() {
		return earsHide;
	}

	public void setEarsHide(String earsHide) {
		this.earsHide = earsHide;
	}
}
