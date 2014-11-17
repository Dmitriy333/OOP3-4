package by.bsuir.substances.pants;

import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class SportPants extends Pants {
	private String stripes;//полоски "addidas"
	private String airInsertion;
	public String getStripes() {
		return stripes;
	}
	public void setStripes(String stripes) {
		this.stripes = stripes;
	}
	public String getAirInsertion() {
		return airInsertion;
	}
	public void setAirInsertion(String airInsertion) {
		this.airInsertion = airInsertion;
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
