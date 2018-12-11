/**
 * �������������� ��������� ����������� �������
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * ������ ���������, ����������� �������� ������������ ����������
 */
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Interface extends Components {
	/**
	 * ���������� ������������ ���� ����������
	 */
	private double trMult = 1;
	/**
	 * ���������� ������������ ���� ���
	 */
	private double foodMult = 1;
	/**
	 * ������������� �������� ������
	 */
	private JPanel mainPanel;
	/**
	 * ������������� ��������� ������
	 */
	private JFrame mainFrame;
	/**
	 * �������� ������� ��� �������� ������
	 */
	private JButton[] button = new JButton[2];
	/**
	 * �������� ������� ��� �������� ������� � �������
	 */
	private JPanel[] smallPanel = new JPanel[3];
	/**
	 * �������� ������� ��� �������� �������
	 */
	private JLabel[] label = new JLabel[8];
	/**
	 * �������� ������� ��� �������� ���������
	 */
	private JCheckBox[] checkbox = new JCheckBox[3];
	/**
	 * �������� ������� ��� �������� ��������������
	 */
	private JRadioButton[] radiobutton = new JRadioButton[2];
	/**
	 * �������� ������� ��� �������� ��������� �����
	 */
	private JTextField[] textField = new JTextField[6];
	/**
	 * �������� ������� � ���������� �������
	 */
	private String[] smallPanelNames = { "�������� ������", "���������", "�������" };
	/**
	 * �������� ������� � ���������� ���������
	 */
	private String[] checkboxesNames = { "�������", "����", "����" };
	/**
	 * �������� ������� � ���������� ��������������
	 */
	private String[] radiobuttonNames = { "�����������", "�����" };
	/**
	 * �������� ������� � ���������� ������
	 */
	private String[] buttonNames = { "����������", "�������� ����" };
	/**
	 * �������� ������� � ���������� �������
	 */
	private String[] labelNames = { "���������� �����", "���������� �����",
			"���� ���������� �� ������ �������� �� �����", "��������� ���������� ����-�������", "���������:",
			"��������� ������� �� ������", "� �������� ��:", "����� ���������:" };
	/**
	 * �������� ������� � ������������ �������
	 */
	private int[] smallPanelBounds = { 3, 0, 390, 115, 3, 115, 321, 120, 325, 115, 318, 120 };
	/**
	 * �������� ������� � ������������ ��������������
	 */
	private int[] radiobuttonBounds = { 10, 65, 120, 50, 140, 65, 80, 50 };
	/**
	 * �������� ������� � ������������ �������
	 */
	private int[] labelBounds = { 10, 5, 280, 50, 10, 35, 280, 50, 10, 65, 280, 50, 10, 5, 210, 50, 10, 30, 200, 50, 10,
			5, 200, 50, 10, 30, 200, 50, 400, 17, 130, 25 };
	/**
	 * �������� ������� � ������������ ���������
	 */
	private int[] checkboxesBounds = { 10, 65, 90, 50, 120, 65, 90, 50, 230, 65, 80, 50 };
	/**
	 * �������� ������� � ������������ ��������� �����
	 */
	private int[] textFieldsBounds = { 290, 17, 90, 25, 290, 47, 90, 25, 290, 77, 90, 25, 225, 17, 90, 25, 222, 17, 90,
			25, 547, 17, 90, 25 };
	/**
	 * �������� ������� � ������������ ������
	 */
	private int[] buttonBounds = { 400, 47, 237, 25, 400, 77, 237, 25 };

	public Interface() {
		/**
		 * �������� �������� ������
		 */
		mainPanel = CreateMainPanel();
		/**
		 * �������� ������
		 */
		mainFrame = CreateMainFrame("������ ��������� ����", mainPanel, 650, 270);
		/**
		 * ���������� ������� ������� ���������� � ���������
		 */
		for (int i = 0; i < 8; i++) {
			label[i] = CreateLabel(labelNames[i], labelBounds[i * 4], labelBounds[i * 4 + 1], labelBounds[i * 4 + 2],
					labelBounds[i * 4 + 3]);
		}
		/**
		 * ���������� ������� ��������� ����� ���������
		 */
		for (int i = 0; i < 6; i++) {
			textField[i] = CreateTextField(textFieldsBounds[i * 4], textFieldsBounds[i * 4 + 1],
					textFieldsBounds[i * 4 + 2], textFieldsBounds[i * 4 + 3]);

		}
		/**
		 * ������������� �������, ��������������� ���� � ��������� ����
		 */
		textFieldFilter j = new textFieldFilter();
		/**
		 * ���������� ����������� � ��������� �����
		 */
		for (int i = 0; i < 5; i++) {
			j.PTextFilter(textField[i], 7);
		}
		/**
		 * �������� ������� � �������, ������������ ������� � ��������� ����� � ������ ������
		 */
		for (int i = 0; i < 3; i++) {
			smallPanel[i] = CreateSmallPanel(smallPanelNames[i], smallPanelBounds[i * 4], smallPanelBounds[i * 4 + 1],
					smallPanelBounds[i * 4 + 2], smallPanelBounds[i * 4 + 3]);
			mainPanel.add(smallPanel[i]);
			smallPanel[0].add(label[i]);
			smallPanel[0].add(textField[i]);
		}
		/**
		 * �������� ������ � ��������������, ������������ � ��� �������� � ������� ��������, ������������ �� � �������
		 */
		for (int i = 0; i < 2; i++) {
			button[i] = CreateButton(buttonNames[i], buttonBounds[i * 4], buttonBounds[i * 4 + 1],
					buttonBounds[i * 4 + 2], buttonBounds[i * 4 + 3]);
			radiobutton[i] = CreateRadioButton(radiobuttonNames[i], radiobuttonBounds[i * 4],
					radiobuttonBounds[i * 4 + 1], radiobuttonBounds[i * 4 + 2], radiobuttonBounds[i * 4 + 3]);
			smallPanel[1].add(radiobutton[i]);
			mainPanel.add(button[i]);
		}
		/**
		 * �������� ���������, ������������ � ��� �������� � ������� ��������
		 */
		for (int i = 0; i < 3; i++) {
			checkbox[i] = CreateCheckBox(checkboxesNames[i], checkboxesBounds[i * 4], checkboxesBounds[i * 4 + 1],
					checkboxesBounds[i * 4 + 2], checkboxesBounds[i * 4 + 3]);
			smallPanel[2].add(checkbox[i]);
		}
		/**
		 * ������ �� ��������� ���������� ���� ��� ������
		 */
		textField[5].setEditable(false);
		/**
		 * ������������ ���������� ����������� ��������� � �������
		 */
		mainPanel.add(textField[5]);
		mainPanel.add(label[7]);
		smallPanel[1].add(label[4]);
		smallPanel[1].add(label[3]);
		smallPanel[1].add(textField[3]);
		smallPanel[2].add(label[5]);
		smallPanel[2].add(label[6]);
		smallPanel[2].add(textField[4]);
		/**
		 * ���������� � �������������� ������, ��������������� ����� ������ ������ �� ��������������
		 */
		selectRadioBtn(radiobutton[0], radiobutton[1]);
		/**
		 * ��������� ��������� ������
		 */
		mainFrame.setVisible(true);
		/**
		 * ���������� ����������� ��� ������ ������
		 */
		button[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * �������� �� ������������� �����
				 */
				if (!textField[0].getText().isEmpty() && !textField[1].getText().isEmpty()
						&& !textField[2].getText().isEmpty() && !textField[3].getText().isEmpty()
						&& !textField[4].getText().isEmpty()) {
					/**
					 * �������� �� ����� ���� �� ������ ��������
					 */
					if (checkbox[0].isSelected() || checkbox[1].isSelected() || checkbox[2].isSelected()) {
						/**
						 * �������� �� ����� ���� �� ������ �������������
						 */
						if (radiobutton[0].isSelected() || radiobutton[1].isSelected()) {
							/**
							 * ���������� ������������ ��� � ������ ������ ����������������� ��������
							 */
							if (checkbox[0].isSelected()) {
								foodMult = foodMult + 0.2;
							}
							/**
							 * ���������� ������������ ��� � ������ ������ ����������������� ��������
							 */
							if (checkbox[1].isSelected()) {
								foodMult = foodMult + 0.2;
							}
							/**
							 * ���������� ������������ ��� � ������ ������ ����������������� ��������
							 */
							if (checkbox[2].isSelected()) {
								foodMult = foodMult + 0.2;
							}
							/**
							 * ���������� ������������ ���������� � ������ ������ ����������������� �������������
							 */
							if (radiobutton[0].isSelected()) {
								trMult = trMult + 0.34;
							}
							/**
							 * ���������� ������������ ���������� � ������ ������ ����������������� �������������
							 */
							if (radiobutton[1].isSelected()) {
								trMult = trMult + 0.28;
							}
							/**
							 * ���������� ��������, ��������������� ��������� ����, ������� ��� ��������, ����������� �������������
							 */
							Tour a = new Tour(Double.parseDouble(textField[1].getText()),
									Double.parseDouble(textField[0].getText()), trMult, foodMult,
									Double.parseDouble(textField[2].getText()),
									Double.parseDouble(textField[3].getText()),
									Double.parseDouble(textField[4].getText()));
							/**
							 * ����� ���������� �������� � ����������� � ����
							 */
							textField[5].setText(a.getResult());
							/**
							 * ��������� ������������� ����� ���������� �������
							 */
							foodMult = 1;
							trMult = 1;
						}
					}
				}
			}
		});
		/**
		 * ���������� ����������� ��� ������ �������
		 */
		button[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * ������� �����, ����� �������� ������ ������
				 */
				for (int i = 0; i < 6; i++) {
					textField[i].setText("");

				}
			}
		});
	}
	/**
	 * �����, ��������������� ���������� �� ����� ������ ������ �������������
	 * @param radio1 �������������, ������������ ������
	 * @param radio2 �������������, ������������ ������
	 */
	public void selectRadioBtn(JRadioButton radio1, JRadioButton radio2) {
		/**
		 * �������� ����������� ������� ��� ������� �������������
		 */
		radio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * ��������� ������ ������ ������� �������������, ��� ������ ������� �������������
				 */
				if (radio1.isSelected()) radio2.setSelected(false);
			}
		});
		/**
		 * �������� ����������� ������� ��� ������� �������������
		 */
		radio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * ��������� ������ ������ ������� �������������, ��� ������ ������� �������������
				 */
				if (radio2.isSelected()) radio1.setSelected(false);
			}
		});
	}
}
