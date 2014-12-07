package by.bsuir.main;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.JFrame;

import by.bsuir.logic.BinaryParser;
import by.bsuir.logic.TextParser;
import by.bsuir.logic.XmlParser;
import by.bsuir.logic.xmlException;
import by.bsuir.substances.abstr.Cloth;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import org.reflections.Reflections;

import javax.swing.JCheckBoxMenuItem;
import javax.xml.transform.TransformerException;

public class MainFraim {
	private List<Cloth> clothes;
	private void getSubclasses(){
		List<String> figures = new ArrayList<>();
		Reflections reflections = new Reflections("by.bsuir.substances");
		Set<Class<? extends Cloth>> subTypes = reflections.getSubTypesOf(Cloth.class);
		for (Class<? extends Cloth> class1 : subTypes) {
			if(!Modifier.isAbstract(class1.getModifiers())){
				figures.add(class1.getName());	
			}
		}
		comboBox_2.setModel(new DefaultComboBoxModel<Object>(figures.toArray()));
	}
	private void initComboBox(JComboBox<Object> comboBox, List<Cloth> clothes){
		comboBox.setModel(new DefaultComboBoxModel<Object>(clothes.toArray()));
	}
	private JFrame frame;
	private JComboBox<Object> comboBox_1;
	private JTextField txtField_1;
	private JTextField txtField_2;
	private JLabel lbl_4;
	private JTextField txtField_4;
	private JLabel lbl_3;
	private JTextField txtField_3;
	private JLabel lbl_5;
	private JTextField txtField_5;
	private JLabel lbl_6;
	private JTextField txtField_6;
	private JLabel lbl_7;
	private JTextField txtField_7;
	private JLabel lbl_8;
	private JTextField txtField_8;
	private JLabel lbl_1;
	private JLabel lbl_2;
	private List<JLabel> labels = new ArrayList<>();
	private List<JTextField> textFields = new ArrayList<>();
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmXml;
	private JMenuItem mntmBinary;
	private JMenu mnNewMenu;
	private JMenu menu;
	private JMenuItem mntmSaveToXml;
	private JMenuItem menuItem;
	private JComboBox<Object> comboBox_2;
	private JMenuItem menuItem_1;
	private JMenuItem menuItem_2;
	private JMenu mnSettings;
	private JMenu menu_1;
	private JCheckBoxMenuItem transformationMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFraim window = new MainFraim();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFraim() {
		initialize();
		JButton btnUpdate = new JButton("\u041E\u0431\u043D\u043E\u0432\u0438\u0442\u044C \u043E\u0431\u044A\u0435\u043A\u0442");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(clothes != null && clothes.size()>0){
					Cloth cloth = (Cloth)comboBox_1.getSelectedItem();
					cloth.updateInfo(labels, textFields);
				}
			}
		});
		
		JButton btnDelete = new JButton("\u0423\u0434\u0430\u043B\u0438\u0442\u044C \u043E\u0431\u044A\u0435\u043A\u0442");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(clothes != null && clothes.size()>0){
					Cloth cloth = (Cloth)comboBox_1.getSelectedItem();
					clothes.remove(cloth);
					initComboBox(comboBox_1, clothes);
					cloth = (Cloth)comboBox_1.getSelectedItem();
					cloth.showInfo(labels, textFields);
				}
			}
		});
		
		comboBox_2 = new JComboBox<Object>();
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		getSubclasses();
		
		JButton button = new JButton("\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C \u043E\u0431\u044A\u0435\u043A\u0442");
		button.addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				Class<Cloth> clazz;
				Constructor<Cloth> ctor;
				Cloth cloth;
				Object object;
				try {
					clazz = (Class<Cloth>) Class.forName((String)comboBox_2.getSelectedItem());
					ctor = clazz.getConstructor();
					object = ctor.newInstance();
					cloth = (Cloth)object;
					if(clothes != null){
						clothes.add(cloth);
					}else{
						clothes = new ArrayList<>();
						clothes.add(cloth);
					}
					
					cloth.showInfo(labels, textFields);
					initComboBox(comboBox_1, clothes);
					comboBox_1.setSelectedItem(cloth);
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lbl_8)
						.addComponent(lbl_7)
						.addComponent(lbl_6)
						.addComponent(lbl_5)
						.addComponent(lbl_4)
						.addComponent(lbl_3)
						.addComponent(lbl_2)
						.addComponent(lbl_1))
					.addGap(59)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(txtField_8, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
						.addComponent(txtField_5, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
						.addComponent(txtField_6, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
						.addComponent(txtField_7, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
						.addComponent(txtField_4)
						.addComponent(txtField_3)
						.addComponent(txtField_2)
						.addComponent(txtField_1))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(74)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
							.addGap(34)
							.addComponent(comboBox_2, 0, 210, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(130)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnDelete, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnUpdate, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
							.addComponent(button)
							.addGap(114))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnUpdate)
								.addComponent(button))
							.addGap(18)
							.addComponent(btnDelete))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbl_1))
							.addGap(7)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbl_2))
							.addGap(8)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbl_3))
							.addGap(15)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbl_4))
							.addGap(10)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbl_5))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbl_6))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbl_7))
							.addGap(9)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbl_8))))
					.addGap(185))
		);
		frame.getContentPane().setLayout(groupLayout);
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mnNewMenu = new JMenu("\u0417\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u044C");
		mnFile.add(mnNewMenu);
		
		mntmXml = new JMenuItem("Xml \u0444\u0430\u0439\u043B");
		mnNewMenu.add(mntmXml);
		
		mntmBinary = new JMenuItem("\u0411\u0438\u043D\u0430\u0440\u043D\u044B\u0439 \u0444\u0430\u0439\u043B");
		mnNewMenu.add(mntmBinary);
		
		menuItem_2 = new JMenuItem("\u0418\u0437 \u0442\u0435\u043A\u0441\u0442\u043E\u0432\u043E\u0433\u043E \u0444\u0430\u0439\u043B\u0430");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileopen = new JFileChooser();             
		        int ret = fileopen.showDialog(null, "Open file");                
		        if (ret == JFileChooser.APPROVE_OPTION) {
		            File file = fileopen.getSelectedFile();
		            TextParser textParser = new TextParser();
	            	clothes = textParser.readFromTextFile(file.getAbsolutePath());
		    		initComboBox(comboBox_1, clothes);
		    		((Cloth)comboBox_1.getSelectedItem()).showInfo(labels, textFields);;
		        }
			}
		});
		mnNewMenu.add(menuItem_2);
		
		menu = new JMenu("\u0421\u043E\u0445\u0440\u0430\u043D\u0438\u0442\u044C");
		mnFile.add(menu);
		
		mntmSaveToXml = new JMenuItem("\u0412 Xml \u0444\u0430\u0439\u043B");
		mntmSaveToXml.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setDialogTitle("Specify a file to save"); 
					int userSelection = fileChooser.showSaveDialog(null);
					if (userSelection == JFileChooser.APPROVE_OPTION) {
					    File fileToSave = fileChooser.getSelectedFile();
					    XmlParser xmlParser = new XmlParser();
					    if(transformationMenu.isSelected()){
					    	xmlParser.saveToXml(fileToSave.getAbsolutePath(), clothes, true);
					    }else{
					    	xmlParser.saveToXml(fileToSave.getAbsolutePath(), clothes, false);
					    }
						
					}
			}
		});
		menu.add(mntmSaveToXml);
		
		menuItem = new JMenuItem("\u0412 \u0431\u0438\u043D\u0430\u0440\u043D\u044B\u0439 \u0444\u0430\u0439\u043B");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Specify a file to save"); 
				int userSelection = fileChooser.showSaveDialog(null);
				if (userSelection == JFileChooser.APPROVE_OPTION) {
				    File fileToSave = fileChooser.getSelectedFile();
				    BinaryParser binaryParser = new BinaryParser();
				    binaryParser.saveToBinary(clothes, fileToSave.getAbsolutePath());
				}
			}
		});
		menu.add(menuItem);
		
		menuItem_1 = new JMenuItem("\u0412 \u0442\u0435\u043A\u0441\u0442\u043E\u0432\u044B\u0439 \u0444\u0430\u0439\u043B");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Specify a file to save"); 
				int userSelection = fileChooser.showSaveDialog(null);
				if (userSelection == JFileChooser.APPROVE_OPTION) {
				    File fileToSave = fileChooser.getSelectedFile();
				    TextParser textParser = new TextParser();
				    textParser.witeToTextFile(clothes, fileToSave.getAbsolutePath());
				}
			}
		});
		menu.add(menuItem_1);
		
		mnSettings = new JMenu("Settings");
		menuBar.add(mnSettings);
		
		menu_1 = new JMenu("\u041C\u043E\u0434\u0438\u0444\u0438\u0446\u0438\u0440\u043E\u0432\u0430\u043D\u0438\u0435");
		mnSettings.add(menu_1);
		
		transformationMenu = new JCheckBoxMenuItem("\u041C\u043E\u0434\u0438\u0444\u0438\u0446\u0438\u0440\u043E\u0432\u0430\u043D\u0438\u0435 XML");
		menu_1.add(transformationMenu);
		mntmBinary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileopen = new JFileChooser();             
		        int ret = fileopen.showDialog(null, "Open file");                
		        if (ret == JFileChooser.APPROVE_OPTION) {
		            File file = fileopen.getSelectedFile();
		            BinaryParser binaryParser = new BinaryParser();
		            try {
						clothes = binaryParser.readFromBinary(file.getAbsolutePath());
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					}
		    		initComboBox(comboBox_1, clothes);
		    		((Cloth)comboBox_1.getSelectedItem()).showInfo(labels, textFields);;
		        }
				
				
			}
		});
		mntmXml.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileopen = new JFileChooser();             
		        int ret = fileopen.showDialog(null, "Open file");                
		        if (ret == JFileChooser.APPROVE_OPTION) {
		            File file = fileopen.getSelectedFile();
		            XmlParser xmlParser = new XmlParser();
		            try {
			            if(transformationMenu.isSelected()){
							clothes = xmlParser.readFromXml(file.getAbsolutePath(), true);
			            }else{
			            	clothes = xmlParser.readFromXml(file.getAbsolutePath(), false);
			            }
			            initComboBox(comboBox_1, clothes);
			    		((Cloth)comboBox_1.getSelectedItem()).showInfo(labels, textFields);
		            } catch (TransformerException e1) {
		        		JOptionPane.showMessageDialog(null, "Unable to read from this xml file", "Error", JOptionPane.PLAIN_MESSAGE);
					} catch (xmlException e1) {
		        		JOptionPane.showMessageDialog(null, "Unable to read from this xml file", "Error", JOptionPane.PLAIN_MESSAGE);
					}
		        }
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1047, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		comboBox_1 = new JComboBox<Object>();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cloth cloth = (Cloth)comboBox_1.getSelectedItem();
				cloth.showInfo(labels, textFields);
			}
		});
		
		lbl_1 = new JLabel("New label");
		
		txtField_1 = new JTextField();
		txtField_1.setColumns(10);
		
		lbl_2 = new JLabel("New label");
		
		txtField_2 = new JTextField();
		txtField_2.setColumns(10);
		
		lbl_4 = new JLabel("New label");
		
		txtField_4 = new JTextField();
		txtField_4.setColumns(10);
		
		lbl_3 = new JLabel("New label");
		
		txtField_3 = new JTextField();
		txtField_3.setColumns(10);
		
		lbl_5 = new JLabel("New label");
		
		txtField_5 = new JTextField();
		txtField_5.setColumns(10);
		
		lbl_6 = new JLabel("New label");
		
		txtField_6 = new JTextField();
		txtField_6.setColumns(10);
		
		lbl_7 = new JLabel("New label");
		
		txtField_7 = new JTextField();
		txtField_7.setColumns(10);
		
		lbl_8 = new JLabel("New label");
		
		txtField_8 = new JTextField();
		txtField_8.setColumns(10);
		labels.add(lbl_1);
		labels.add(lbl_2);
		labels.add(lbl_3);
		labels.add(lbl_4);
		labels.add(lbl_5);
		labels.add(lbl_6);
		labels.add(lbl_7);
		labels.add(lbl_8);
		textFields.add(txtField_1);
		textFields.add(txtField_2);
		textFields.add(txtField_3);
		textFields.add(txtField_4);
		textFields.add(txtField_5);
		textFields.add(txtField_6);
		textFields.add(txtField_7);
		textFields.add(txtField_8);
	}
}
