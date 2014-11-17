package by.bsuir.substances.jacket;

import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Anorak extends Jacket{
	private String filler;//�����������
	private String hood;//�������
	public String getFiller() {
		return filler;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}

	public String getHood() {
		return hood;
	}

	public void setHood(String hood) {
		this.hood = hood;
	}

	@Override
	public void showInfo(List<JLabel> labels, List<JTextField> textFields) {
		labels.get(0).setText("���: ");
		labels.get(1).setText("����: ");
		labels.get(2).setText("������: ");
		labels.get(3).setText("���: ");
		labels.get(4).setText("������: ");
		labels.get(5).setText("��� �������: ");
		labels.get(6).setText("����������� :");
		labels.get(7).setText("�������: ");
		
		textFields.get(0).setText(String.valueOf(this.getWeigth()));
		textFields.get(1).setText(String.valueOf(this.getPrice()));
		textFields.get(2).setText(String.valueOf(this.getSize()));
		textFields.get(3).setText(this.getSex());
		textFields.get(4).setText(this.getSleeves());
		textFields.get(5).setText(this.getTypeOfLenght());
		textFields.get(6).setText(this.getFiller());
		textFields.get(7).setText(this.getHood());			
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
