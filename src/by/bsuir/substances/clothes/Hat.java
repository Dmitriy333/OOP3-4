package by.bsuir.substances.clothes;

import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;

import by.bsuir.substances.abstr.Headdress;

public class Hat extends Headdress{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int visorDiameter;
	private String concavity; //вогнутость
	public int getVisorDiameter() {
		return visorDiameter;
	}

	public void setVisorDiameter(int visorDiameter) {
		this.visorDiameter = visorDiameter;
	}

	public String getConcavity() {
		return concavity;
	}

	public void setConcavity(String concavity) {
		this.concavity = concavity;
	}

	@Override
	public void showInfo(List<JLabel> labels, List<JTextField> textFields) {
		labels.get(0).setText("Вес: ");
		labels.get(1).setText("Цена: ");
		labels.get(2).setText("Размер: ");
		labels.get(3).setText("Пол: ");
		labels.get(4).setText("Облегание: ");
		labels.get(5).setText("Укрывание ушей: ");
		labels.get(6).setText("Диаметр козырька :");
		labels.get(7).setText("Вогнутость: ");
		
		textFields.get(0).setText(String.valueOf(this.getWeigth()));
		textFields.get(1).setText(String.valueOf(this.getPrice()));
		textFields.get(2).setText(String.valueOf(this.getSize()));
		textFields.get(3).setText(this.getSex());
		textFields.get(4).setText(this.getCling());
		textFields.get(5).setText(this.getEarsHide());
		textFields.get(6).setText(String.valueOf(this.getVisorDiameter()));
		textFields.get(7).setText(this.getConcavity());	
	}

	@Override
	public void updateInfo(List<JLabel> labels, List<JTextField> textFields) {
		this.setWeigth(Double.valueOf(textFields.get(0).getText()));
		this.setPrice(Double.valueOf(textFields.get(1).getText()));
		this.setSize(Integer.valueOf(textFields.get(2).getText()));
		this.setSex(textFields.get(3).getText());
		this.setCling(textFields.get(4).getText());
		this.setEarsHide(textFields.get(5).getText());
		this.setVisorDiameter(Integer.valueOf(textFields.get(6).getText()));
		this.setConcavity(textFields.get(7).getText());
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
		sb.append("visor_diameter " + this.getVisorDiameter()+"\r\n");
		sb.append("concavity " + this.getConcavity()+"\r\n");
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
		this.setVisorDiameter(Integer.valueOf(properties.get(6)));
		this.setConcavity(properties.get(7));		
	}
}
