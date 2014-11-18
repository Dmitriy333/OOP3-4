package by.bsuir.substances.clothes;

import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;

import by.bsuir.substances.abstr.Boots;

public class Sneakers extends Boots{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int shoelaceLength;
	private String airInsertion; 
	public int getShoelaceLength() {
		return shoelaceLength;
	}
	public void setShoelaceLength(int shoelaceLength) {
		this.shoelaceLength = shoelaceLength;
	}
	public String getAirInsertion() {
		return airInsertion;
	}
	public void setAirInsertion(String airInsertion) {
		this.airInsertion = airInsertion;
	}
	@Override
	public void showInfo(List<JLabel> labels, List<JTextField> textFields) {
		labels.get(0).setText("Вес");
		labels.get(1).setText("Цена");
		labels.get(2).setText("Размер");
		labels.get(3).setText("Пол");
		labels.get(4).setText("Материал изготовления");
		labels.get(5).setText("Материал подошвы");
		labels.get(6).setText("Длина шнурков");
		labels.get(7).setText("Воздушные вставки");
		
		textFields.get(0).setText(String.valueOf(this.getWeigth()));
		textFields.get(1).setText(String.valueOf(this.getPrice()));
		textFields.get(2).setText(String.valueOf(this.getSize()));
		textFields.get(3).setText(this.getSex());
		textFields.get(4).setText(this.getMaterial());
		textFields.get(5).setText(this.getSoleMaterial());
		textFields.get(6).setText(String.valueOf(this.getShoelaceLength()));
		textFields.get(7).setText(this.getAirInsertion());		
	}
	@Override
	public void updateInfo(List<JLabel> labels, List<JTextField> textFields) {
		this.setWeigth(Double.valueOf(textFields.get(0).getText()));
		this.setPrice(Double.valueOf(textFields.get(1).getText()));
		this.setSize(Integer.valueOf(textFields.get(2).getText()));
		this.setSex(textFields.get(3).getText());
		this.setMaterial(textFields.get(4).getText());
		this.setSoleMaterial(textFields.get(5).getText());
		this.setShoelaceLength(Integer.valueOf(textFields.get(6).getText()));
		this.setAirInsertion(textFields.get(7).getText());				
	}
	
	public void setInfo(List<String> properties) {
		this.setWeigth(Double.valueOf(properties.get(0)));
		this.setPrice(Double.valueOf(properties.get(1)));
		this.setSize(Integer.valueOf(properties.get(2)));
		this.setSex(properties.get(3));
		this.setMaterial(properties.get(4));
		this.setSoleMaterial(properties.get(5));
		this.setShoelaceLength(Integer.valueOf(properties.get(6)));
		this.setAirInsertion(properties.get(7));				
	}
	@Override
	public String toStringView() {
		StringBuilder sb = new StringBuilder();
		sb.append("class " + this.getClass().getCanonicalName()+"\r\n");
		sb.append("weight " + this.getWeigth()+"\r\n");
		sb.append("price " + this.getPrice()+"\r\n");
		sb.append("size " + this.getSize()+"\r\n");
		sb.append("sex " + this.getSex()+"\r\n");
		sb.append("material " + this.getMaterial()+"\r\n");
		sb.append("sole_material " + this.getSoleMaterial()+"\r\n");
		sb.append("shoelace_length " + this.getShoelaceLength()+"\r\n");
		sb.append("air_insertion " + this.getAirInsertion()+"\r\n");
		return sb.toString();
	}
}
