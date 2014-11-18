package by.bsuir.substances.clothes;

import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;

import by.bsuir.substances.abstr.Jacket;


public class Anorak extends Jacket{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String filler;//наполнитель
	private String hood;//капюшон
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
		labels.get(0).setText("Вес: ");
		labels.get(1).setText("Цена: ");
		labels.get(2).setText("Размер: ");
		labels.get(3).setText("Пол: ");
		labels.get(4).setText("Рукава: ");
		labels.get(5).setText("Тип размера: ");
		labels.get(6).setText("Наполнитель :");
		labels.get(7).setText("Капюшон: ");
		
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
		this.setWeigth(Double.valueOf(textFields.get(0).getText()));
		this.setPrice(Double.valueOf(textFields.get(1).getText()));
		this.setSize(Integer.valueOf(textFields.get(2).getText()));
		this.setSex(textFields.get(3).getText());
		this.setSleeves(textFields.get(4).getText());
		this.setTypeOfLenght(textFields.get(5).getText());
		this.setFiller(textFields.get(6).getText());
		this.setHood(textFields.get(7).getText());
	}

	@Override
	public String toStringView() {
		StringBuilder sb = new StringBuilder();
		sb.append("class " + this.getClass().getCanonicalName()+"\r\n");
		sb.append("weight " + this.getWeigth()+"\r\n");
		sb.append("price " + this.getPrice()+"\r\n");
		sb.append("size " + this.getSize()+"\r\n");
		sb.append("sex " + this.getSex()+"\r\n");
		sb.append("sleeves " + this.getSleeves()+"\r\n");
		sb.append("type_of_length " + this.getTypeOfLenght()+"\r\n");
		sb.append("filler " + this.getFiller()+"\r\n");
		sb.append("hood " + this.getHood()+"\r\n");
		return sb.toString();
	}

	@Override
	public void setInfo(List<String> properties) {
		this.setWeigth(Double.valueOf(properties.get(0)));
		this.setPrice(Double.valueOf(properties.get(1)));
		this.setSize(Integer.valueOf(properties.get(2)));
		this.setSex(properties.get(3));
		this.setSleeves(properties.get(4));
		this.setTypeOfLenght(properties.get(5));
		this.setFiller(properties.get(6));
		this.setHood(properties.get(7));		
	}
}
