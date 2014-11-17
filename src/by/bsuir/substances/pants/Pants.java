package by.bsuir.substances.pants;

import by.bsuir.substances.Cloth;

public abstract class Pants extends Cloth{
	private int waistlineSize;//талия
	private String cling;//облегание

	public int getWaistlineSize() {
		return waistlineSize;
	}

	public void setWaistlineSize(int waistlineSize) {
		this.waistlineSize = waistlineSize;
	}

	public String getCling() {
		return cling;
	}

	public void setCling(String cling) {
		this.cling = cling;
	}
}
