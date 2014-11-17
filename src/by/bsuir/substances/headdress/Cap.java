package by.bsuir.substances.headdress;

import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cap extends Headdress{
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCloth() {
		// TODO Auto-generated method stub
		
	}
}
