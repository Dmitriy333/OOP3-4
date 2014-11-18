package by.bsuir.substances.abstr;

import java.io.Serializable;

public abstract class Cloth implements ViewInfo, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double weigth;
	private double  price;
	private int size;
	private String sex;
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}
