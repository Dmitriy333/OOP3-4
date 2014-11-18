package by.bsuir.substances.clothes;

import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;

import by.bsuir.substances.abstr.Boots;


public class Sandals extends Boots{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fasteners;
	private String supinator;

	public String getFasteners() {
		return fasteners;
	}

	public void setFasteners(String fasteners) {
		this.fasteners = fasteners;
	}

	public String getSupinator() {
		return supinator;
	}

	public void setSupinator(String supinator) {
		this.supinator = supinator;
	}

	@Override
	public void showInfo(List<JLabel> labels, List<JTextField> textFields) {
		labels.get(0).setText("Вес");
		labels.get(1).setText("Цена");
		labels.get(2).setText("Размер");
		labels.get(3).setText("Пол");
		labels.get(4).setText("Материал изготовления");
		labels.get(5).setText("Материал подошвы");
		labels.get(6).setText("Застёжки");
		labels.get(7).setText("Супинатор");
		
		textFields.get(0).setText(String.valueOf(this.getWeigth()));
		textFields.get(1).setText(String.valueOf(this.getPrice()));
		textFields.get(2).setText(String.valueOf(this.getSize()));
		textFields.get(3).setText(this.getSex());
		textFields.get(4).setText(this.getMaterial());
		textFields.get(5).setText(this.getSoleMaterial());
		textFields.get(6).setText(this.getFasteners());
		textFields.get(7).setText(this.getSupinator());
		
	}

	@Override
	public void updateInfo(List<JLabel> labels, List<JTextField> textFields) {
		this.setWeigth(Double.valueOf(textFields.get(0).getText()));
		this.setPrice(Double.valueOf(textFields.get(1).getText()));
		this.setSize(Integer.valueOf(textFields.get(2).getText()));
		this.setSex(textFields.get(3).getText());
		this.setMaterial(textFields.get(4).getText());
		this.setSoleMaterial(textFields.get(5).getText());
		this.setFasteners(textFields.get(6).getText());
		this.setSupinator(textFields.get(7).getText());		
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
		sb.append("fasteners " + this.getFasteners()+"\r\n");
		sb.append("supinator " + this.getSupinator()+"\r\n");
		return sb.toString();
	}

	@Override
	public void setInfo(List<String> properties) {
		this.setWeigth(Double.valueOf(properties.get(0)));
		this.setPrice(Double.valueOf(properties.get(1)));
		this.setSize(Integer.valueOf(properties.get(2)));
		this.setSex(properties.get(3));
		this.setMaterial(properties.get(4));
		this.setSoleMaterial(properties.get(5));
		this.setFasteners(properties.get(6));
		this.setSupinator(properties.get(7));			
	}
}
