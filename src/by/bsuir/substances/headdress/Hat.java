package by.bsuir.substances.headdress;

import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Hat extends Headdress{
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCloth() {
		// TODO Auto-generated method stub
		
	}
}
