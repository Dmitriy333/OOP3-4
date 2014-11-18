package by.bsuir.substances.clothes;

import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;

import by.bsuir.substances.abstr.Pants;

public class Trousers extends Pants{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String arrows;//стрелки
	private String narrowBottom;//зауживание снизу
	public String getNarrowBottom() {
		return narrowBottom;
	}
	public void setNarrowBottom(String narrowBottom) {
		this.narrowBottom = narrowBottom;
	}
	public String getArrows() {
		return arrows;
	}
	public void setArrows(String arrows) {
		this.arrows = arrows;
	}
	@Override
	public void showInfo(List<JLabel> labels, List<JTextField> textFields) {
		labels.get(0).setText("Вес: ");
		labels.get(1).setText("Цена: ");
		labels.get(2).setText("Размер: ");
		labels.get(3).setText("Пол: ");
		labels.get(4).setText("Обхват талии: ");
		labels.get(5).setText("Облегание: ");
		labels.get(6).setText("Стрелки: ");
		labels.get(7).setText("Зауживание снизу: ");
		
		textFields.get(0).setText(String.valueOf(this.getWeigth()));
		textFields.get(1).setText(String.valueOf(this.getPrice()));
		textFields.get(2).setText(String.valueOf(this.getSize()));
		textFields.get(3).setText(this.getSex());
		textFields.get(4).setText(String.valueOf(this.getWaistlineSize()));
		textFields.get(5).setText(this.getCling());
		textFields.get(6).setText(this.getArrows());
		textFields.get(7).setText(this.getNarrowBottom());	
	}
	@Override
	public void updateInfo(List<JLabel> labels, List<JTextField> textFields) {
		this.setWeigth(Double.valueOf(textFields.get(0).getText()));
		this.setPrice(Double.valueOf(textFields.get(1).getText()));
		this.setSize(Integer.valueOf(textFields.get(2).getText()));
		this.setSex(textFields.get(3).getText());
		this.setWaistlineSize(Integer.valueOf(textFields.get(4).getText()));
		this.setCling(textFields.get(5).getText());
		this.setArrows(textFields.get(6).getText());
		this.setNarrowBottom(textFields.get(7).getText());
	}
	@Override
	public String toStringView() {
		StringBuilder sb = new StringBuilder();
		sb.append("class " + this.getClass().getCanonicalName()+"\r\n");
		sb.append("weight " + this.getWeigth()+"\r\n");
		sb.append("price " + this.getPrice()+"\r\n");
		sb.append("size " + this.getSize()+"\r\n");
		sb.append("sex " + this.getSex()+"\r\n");
		sb.append("waistline_size " + this.getWaistlineSize()+"\r\n");
		sb.append("cling " + this.getCling()+"\r\n");
		sb.append("arrows " + this.getArrows()+"\r\n");
		sb.append("narrow_bottom " + this.getNarrowBottom()+"\r\n");
		return sb.toString();
	}
	@Override
	public void setInfo(List<String> properties) {
		this.setWeigth(Double.valueOf(properties.get(0)));
		this.setPrice(Double.valueOf(properties.get(1)));
		this.setSize(Integer.valueOf(properties.get(2)));
		this.setSex(properties.get(3));
		this.setWaistlineSize(Integer.valueOf(properties.get(4)));
		this.setCling(properties.get(5));
		this.setArrows(properties.get(6));
		this.setNarrowBottom(properties.get(7));		
	}
}
