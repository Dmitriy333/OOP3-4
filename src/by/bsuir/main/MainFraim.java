package by.bsuir.main;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import by.bsuir.substances.Cloth;
import by.bsuir.substances.boots.Boots;
import by.bsuir.substances.boots.Sandals;
import by.bsuir.substances.boots.Sneakers;
import by.bsuir.substances.headdress.Cap;
import by.bsuir.substances.headdress.Hat;
import by.bsuir.substances.headdress.Headdress;
import by.bsuir.substances.jacket.Anorak;
import by.bsuir.substances.jacket.Coat;
import by.bsuir.substances.jacket.Jacket;
import by.bsuir.substances.pants.Pants;
import by.bsuir.substances.pants.SportPants;
import by.bsuir.substances.pants.Trousers;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class MainFraim {
	private List<Cloth> createObjects(){
		List<Cloth> clothes = new ArrayList<Cloth>();
		List<Boots> boots = new ArrayList<Boots>();
		List<Pants> pants = new ArrayList<>();
		List<Jacket> jackets = new ArrayList<Jacket>();
		List<Headdress> headdress = new ArrayList<Headdress>();
		Sandals sandals = new Sandals();
		sandals.setWeigth(0.2);
		sandals.setPrice(10);
		sandals.setSex("Мужские");
		sandals.setSize(41);
		sandals.setSupinator("Есть");
		sandals.setMaterial("Кожа");
		sandals.setSoleMaterial("Нубук");
		sandals.setFasteners("Застёжки на липучках");
		Sneakers sneakers = new Sneakers();
		sneakers.setWeigth(0.2);
		sneakers.setPrice(10);
		sneakers.setSex("Мужские");
		sneakers.setSize(41);
		sneakers.setMaterial("Кожа");
		sneakers.setSoleMaterial("Резиновая подошва");
		sneakers.setShoelaceLength(60);
		sneakers.setAirInsertion("Вентиляционные вставки");
		boots.add(sandals);
		boots.add(sneakers);
		SportPants sportPants = new SportPants();
		sportPants.setWeigth(0.3);
		sportPants.setPrice(20);
		sportPants.setSex("Женские");
		sportPants.setSize(26);
		sportPants.setWaistlineSize(60);
		sportPants.setCling("Нормальное обтягивание");
		sportPants.setStripes("Белые полоски по бокам");
		sportPants.setAirInsertion("Без вентиляционных вставок");
		Trousers trousers = new Trousers();
		trousers.setWeigth(0.3);
		trousers.setPrice(20);
		trousers.setSex("Женские");
		trousers.setSize(26);
		trousers.setWaistlineSize(60);
		trousers.setCling("Нормальное обтягивание");
		trousers.setArrows("Есть стрелки для заглажки");
		trousers.setNarrowBottom("Зауживание снизу");
		pants.add(sportPants);
		pants.add(trousers);
		Anorak anorak = new Anorak();
		anorak.setWeigth(0.6);
		anorak.setPrice(100.5);
		anorak.setSex("Мужская");
		anorak.setSize(50);
		anorak.setSleeves("С рукавами");
		anorak.setTypeOfLenght("Приталеная (маломерка)");
		anorak.setHood("С капюшоном");
		anorak.setFiller("Пух");
		Coat coat = new Coat();
		coat.setWeigth(0.5);
		coat.setPrice(300);
		coat.setSex("Женское");
		coat.setSize(46);
		coat.setSleeves("С рукавами");
		coat.setTypeOfLenght("Не маломерка");
		coat.setBelt("С ремнём на талии");
		coat.setPockets("Без карманов");
		jackets.add(anorak);
		jackets.add(coat);
		Hat hat = new Hat();
		hat.setWeigth(0.25);
		hat.setPrice(70);
		hat.setSex("Мужская");
		hat.setSize(46);
		hat.setCling("Плотно сидит");
		hat.setEarsHide("Прикрывает уши");
		hat.setVisorDiameter(10);
		hat.setConcavity("Цилиндр (без вогнутости)"); 
		Cap cap = new Cap();
		cap.setWeigth(0.12);
		cap.setPrice(20);
		cap.setSex("Женская");
		cap.setSize(46);
		cap.setCling("Сидит свободно");
		cap.setEarsHide("Прикрывает уши");
		cap.setStretching("Растягивается");
		cap.setElasticBand("Без резинки");
		headdress.add(hat);
		headdress.add(cap);
		clothes.addAll(pants);
		clothes.addAll(jackets);
		clothes.addAll(headdress);
		clothes.addAll(boots);
		return clothes;
	}
	private void initComboBox(JComboBox<Object> comboBox, List<Cloth> clothes){
		comboBox.setModel(new DefaultComboBoxModel<Object>(clothes.toArray()));
	}
	private JFrame frame;
	private JComboBox comboBox_1;
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
		List<Cloth> clothes = createObjects();
		initComboBox(comboBox_1, clothes);
		
		JButton btnUpdate = new JButton("\u041E\u0431\u043D\u043E\u0432\u0438\u0442\u044C \u043E\u0431\u044A\u0435\u043A\u0442");
		
		JButton btnDelete = new JButton("\u0423\u0434\u0430\u043B\u0438\u0442\u044C \u043E\u0431\u044A\u0435\u043A\u0442");
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
					.addGap(74)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(btnDelete, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnUpdate, Alignment.LEADING)))
					.addContainerGap(91, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnUpdate)
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
		for (Cloth cloth : clothes) {
			System.out.println(cloth);
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 748, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cloth cloth = (Cloth)comboBox_1.getSelectedItem();
				cloth.showInfo(labels, textFields);
				System.out.println(comboBox_1.getSelectedItem());
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
