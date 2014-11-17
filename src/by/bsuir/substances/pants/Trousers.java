package by.bsuir.substances.pants;

import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Trousers extends Pants{
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
		// TODO Auto-generated method stub
		
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
