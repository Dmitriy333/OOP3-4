package by.bsuir.substances.jacket;

import by.bsuir.substances.Cloth;

public abstract class Jacket extends Cloth{
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
