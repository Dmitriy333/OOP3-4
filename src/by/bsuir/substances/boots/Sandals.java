package by.bsuir.substances.boots;

import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;


public class Sandals extends Boots{
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
		labels.get(0).setText("���");
		labels.get(1).setText("����");
		labels.get(2).setText("������");
		labels.get(3).setText("���");
		labels.get(4).setText("�������� ������������");
		labels.get(5).setText("�������� �������");
		labels.get(6).setText("�������");
		labels.get(7).setText("���������");
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCloth() {
		// TODO Auto-generated method stub
		
	}
}
