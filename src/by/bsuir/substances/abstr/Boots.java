package by.bsuir.substances.abstr;


public abstract class Boots extends Cloth {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String material;//�������� ������������
	private String soleMaterial;//�������� �������
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
