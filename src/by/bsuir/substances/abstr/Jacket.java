package by.bsuir.substances.abstr;


public abstract class Jacket extends Cloth{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sleeves;
	private String typeOfLenght;
	public String getSleeves() {
		return sleeves;
	}
	public void setSleeves(String sleeves) {
		this.sleeves = sleeves;
	}
	public String getTypeOfLenght() {
		return typeOfLenght;
	}
	public void setTypeOfLenght(String typeOfLenght) {
		this.typeOfLenght = typeOfLenght;
	}
}
