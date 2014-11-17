package by.bsuir.substances.boots;

import by.bsuir.substances.Cloth;

public abstract class Boots extends Cloth {
	private String material;//материал изготовления
	private String soleMaterial;//материал подошвы
	public String getSoleMaterial() {
		return soleMaterial;
	}
	public void setSoleMaterial(String soleMaterial) {
		this.soleMaterial = soleMaterial;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
}
