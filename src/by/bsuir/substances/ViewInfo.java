package by.bsuir.substances;

import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;

public interface ViewInfo {
	void showInfo(List<JLabel> labels, List<JTextField> textFields);
	void updateInfo(List<JLabel> labels, List<JTextField> textFields);
	void deleteCloth();
}
