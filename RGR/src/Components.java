/**
 * ������ ���������, ����������� �������� ������������ ����������
 */
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Components extends JFrame{
/**
 * �����, ��������� � ������������ ����� �� ������ ���������� ��� ����������
 * @param FrameName �������� �����
 * @param Panel ������, ������������� � ������
 * @param w ������ ������
 * @param h ������ ������
 * @return ����� � ������������ � ���� �����������
 */
	protected JFrame CreateMainFrame(String FrameName, JPanel Panel, int w, int h) {
		JFrame mainFrame = new JFrame(FrameName);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(w, h);
		mainFrame.setContentPane(Panel);
		mainFrame.setResizable(false);
		return mainFrame;
	}
	/**
	 * �����, ��������� � ������������ ����� �� ������ ���������� ��� ����������
	 * @param name �������, ������������ �������
	 * @param x ��������� ����� ��������������� ������ �� �������� ������������ ������ �������� ���� ������
	 * @param y ��������� ����� ��������������� ������ �� �������� ������������ ������ �������� ���� ������
	 * @param w ������ ������
	 * @param h ������ ������
	 * @return ����� � ������������ � ���� �����������
	 */
	protected JLabel CreateLabel(String name, int x, int y, int w, int h) {
		JLabel Label = new JLabel(name);
		Label.setBounds(x, y, w, h);
		return Label;
	}
	/**
	 * �����, ��������� � ������������ ��������� ���� �� ������ ���������� ��� ����������
	 * @param x ��������� ����� ��������������� ���������� ���� �� �������� ������������ ������ �������� ���� ������
	 * @param y ��������� ����� ��������������� ���������� ���� �� �������� ������������ ������ �������� ���� ������
	 * @param w ������ ���������� ����
	 * @param h ������ ���������� ����
	 * @return ��������� ���� � ������������ � ���� �����������
	 */
	protected JTextField CreateTextField(int x, int y, int w, int h) {
		JTextField textField = new JTextField();
		textField.setBounds(x, y, w, h);
		return textField;
	}
	/**
	 * �����, ��������� � ����������� ��������� ������ ������������ ��������� � ������
	 * @return ������������ ������
	 */
	protected JPanel CreateMainPanel() {
		JPanel MainPanel = new JPanel();
		MainPanel.setLayout(null);
		return MainPanel;
	}
	/**
	 * �����, ��������� � ������������ ������� �� ������ ���������� ��� ����������
	 * @param name ������� ��������
	 * @param x ��������� ����� ��������������� �������� �� �������� ������������ ������ �������� ���� ������
	 * @param y ��������� ����� ��������������� �������� �� �������� ������������ ������ �������� ���� ������
	 * @param w ������ ��������
	 * @param h ������ ��������
	 * @return ������� � ������������ � ���� �����������
	 */
	protected JCheckBox CreateCheckBox(String name, int x, int y, int w, int h) {
		JCheckBox CheckBox = new JCheckBox();
		CheckBox.setText(name);
		CheckBox.setBounds(x, y, w, h);
		return CheckBox;
	}
	/**
	 * �����, ��������� � ������������ ������������� �� ������ ���������� ��� ����������
	 * @param name ������� �������������
	 * @param x ��������� ����� ��������������� ������������� �� �������� ������������ ������ �������� ���� ������
	 * @param y ��������� ����� ��������������� ������������� �� �������� ������������ ������ �������� ���� ������
	 * @param w ������ �������������
	 * @param h ������ �������������
	 * @return ������������� � ������������ � ���� �����������
	 */
	protected JRadioButton CreateRadioButton(String name, int x, int y, int w, int h) {
		JRadioButton RadioButton = new JRadioButton();
		RadioButton.setText(name);
		RadioButton.setBounds(x, y, w, h);
		return RadioButton;
	}
	/**
	 * �����, ��������� ������ � ������ �� ������ ���������� ��� ����������
	 * @param name �������, ������������ �� �����
	 * @param x ��������� ����� ��������������� ������ �� �������� ������������ ������ �������� ���� ������
	 * @param y ��������� ����� ��������������� ������ �� �������� ������������ ������ �������� ���� ������
	 * @param w ������ ������
	 * @param h ������ ������
	 * @return ������ � ������������ � ��� �����������
	 */
	protected JPanel CreateSmallPanel(String name, int x, int y, int w, int h) {
		JPanel MainPanel = new JPanel();
		MainPanel.setLayout(null);
		MainPanel.setBorder(BorderFactory.createTitledBorder(name));
		MainPanel.setBounds(x, y, w, h);
		return MainPanel;
	}
	/**
	 * �����, ��������� ������ �� ������ ���������� ��� ���������� 
	 * @param name ������� �� ������
	 * @param x ��������� ����� ��������������� ������ �� �������� ������������ ������ �������� ���� ������ 
	 * @param y ��������� ����� ��������������� ������ �� �������� ������������ ������ �������� ���� ������ 
	 * @param h ������ ������
	 * @param w ������ ������
	 * @return ������ � ������������ � ��� �����������
	 */
	protected JButton CreateButton(String name, int x, int y, int h, int w) {
		JButton a = new JButton(name);
		a.setBounds(x, y, h, w);
		return a;
	}
}
