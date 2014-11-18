package by.bsuir.substances.abstr;


public abstract class Headdress extends Cloth {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
