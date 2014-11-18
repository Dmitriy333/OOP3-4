package by.bsuir.substances.clothes;

import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;

import by.bsuir.substances.abstr.Headdress;

public class Cap extends Headdress{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String stretching;//растягивание
	private String elasticBand;//резинка
	public String getStretching() {
		return stretching;
	}

	public void setStretching(String stretching) {
		this.stretching = stretching;
	}

	public String getElasticBand() {
		return elasticBand;
	}

	public void setElasticBand(String elasticBand) {
		this.elasticBand = elasticBand;
	}

	@Override
	public void showInfo(List<JLabel> labels, List<JTextField> textFields) {
		labels.get(0).setText("Вес: ");
		labels.get(1).setText("Цена: ");
		labels.get(2).setText("Размер: ");
		labels.get(3).setText("Пол: ");
		labels.get(4).setText("Облегание: ");
		labels.get(5).setText("Укрывание ушей: ");
		labels.get(6).setText("Растягивание :");
		labels.get(7).setText("Резинка: ");
		
		textFields.get(0).setText(String.valueOf(this.getWeigth()));
		textFields.get(1).setText(String.valueOf(this.getPrice()));
		textFields.get(2).setText(String.valueOf(this.getSize()));
		textFields.get(3).setText(this.getSex());
		textFields.get(4).setText(this.getCling());
		textFields.get(5).setText(this.getEarsHide());
		textFields.get(6).setText(this.getStretching());
		textFields.get(7).setText(this.getElasticBand());		
	}

	@Override
	public void updateInfo(List<JLabel> labels, List<JTextField> textFields) {
		this.setWeigth(Double.valueOf(textFields.get(0).getText()));
		this.setPrice(Double.valueOf(textFields.get(1).getText()));
		this.setSize(Integer.valueOf(textFields.get(2).getText()));
		this.setSex(textFields.get(3).getText());
		this.setCling(textFields.get(4).getText());
		this.setEarsHide(textFields.get(5).getText());
		this.setStretching(textFields.get(6).getText());
		this.setElasticBand(textFields.get(7).getText());		
	}

	@Override
	public String toStringView() {
		StringBuilder sb = new StringBuilder();
		sb.append("class " + this.getClass().getCanonicalName()+"\r\n");
		sb.append("weight " + this.getWeigth()+"\r\n");
		sb.append("price " + this.getPrice()+"\r\n");
		sb.append("size " + this.getSize()+"\r\n");
		sb.append("sex " + this.getSex()+"\r\n");
		sb.append("cling " + this.getCling()+"\r\n");
		sb.append("ears_hide " + this.getEarsHide()+"\r\n");
		sb.append("stretching " + this.getStretching()+"\r\n");
		sb.append("elasticband " + this.getElasticBand()+"\r\n");
		return sb.toString();
	}

	@Override
	public void setInfo(List<String> properties) {
		this.setWeigth(Double.valueOf(properties.get(0)));
		this.setPrice(Double.valueOf(properties.get(1)));
		this.setSize(Integer.valueOf(properties.get(2)));
		this.setSex(properties.get(3));
		this.setCling(properties.get(4));
		this.setEarsHide(properties.get(5));
		this.setStretching(properties.get(6));
		this.setElasticBand(properties.get(7));	
	}
}
