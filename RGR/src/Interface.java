/**
 * Импортирование библиотек обработчика событий
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Импорт библиотек, описывающих элементы графического интерфейса
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
	 * Объявление коэффициента цены транспорта
	 */
	private double trMult = 1;
	/**
	 * Объявление коэффициента цены еды
	 */
	private double foodMult = 1;
	/**
	 * Инициализация основной панели
	 */
	private JPanel mainPanel;
	/**
	 * Инициализация основного фрейма
	 */
	private JFrame mainFrame;
	/**
	 * Создание массива для хранения кнопок
	 */
	private JButton[] button = new JButton[2];
	/**
	 * Создание массива для хранения панелей с рамками
	 */
	private JPanel[] smallPanel = new JPanel[3];
	/**
	 * Создание массива для хранения лейблов
	 */
	private JLabel[] label = new JLabel[8];
	/**
	 * Создание массива для хранения чекбоксов
	 */
	private JCheckBox[] checkbox = new JCheckBox[3];
	/**
	 * Создание массива для хранения переключателей
	 */
	private JRadioButton[] radiobutton = new JRadioButton[2];
	/**
	 * Создание массива для хранения текстовых полей
	 */
	private JTextField[] textField = new JTextField[6];
	/**
	 * Создание массива с названиями панелей
	 */
	private String[] smallPanelNames = { "Основные данные", "Транспорт", "Питание" };
	/**
	 * Создание массива с названиями чекбоксов
	 */
	private String[] checkboxesNames = { "Завтрак", "Обед", "Ужин" };
	/**
	 * Создание массива с названиями переключателей
	 */
	private String[] radiobuttonNames = { "Авиаперелет", "Круиз" };
	/**
	 * Создание массива с названиями кнопок
	 */
	private String[] buttonNames = { "Рассчитать", "Очистить поля" };
	/**
	 * Создание массива с названиями лейблов
	 */
	private String[] labelNames = { "Количество людей", "Количество суток",
			"Цена проживания на одного человека за сутки", "Стоимость транспорта туда-обратно", "Используя:",
			"Стоимость питания за порцию", "С расчетом на:", "Итого стоимость:" };
	/**
	 * Создание массива с координатами панелей
	 */
	private int[] smallPanelBounds = { 3, 0, 390, 115, 3, 115, 321, 120, 325, 115, 318, 120 };
	/**
	 * Создание массива с координатами переключателей
	 */
	private int[] radiobuttonBounds = { 10, 65, 120, 50, 140, 65, 80, 50 };
	/**
	 * Создание массива с координатами лейблов
	 */
	private int[] labelBounds = { 10, 5, 280, 50, 10, 35, 280, 50, 10, 65, 280, 50, 10, 5, 210, 50, 10, 30, 200, 50, 10,
			5, 200, 50, 10, 30, 200, 50, 400, 17, 130, 25 };
	/**
	 * Создание массива с координатами чекбоксов
	 */
	private int[] checkboxesBounds = { 10, 65, 90, 50, 120, 65, 90, 50, 230, 65, 80, 50 };
	/**
	 * Создание массива с координатами текстовых полей
	 */
	private int[] textFieldsBounds = { 290, 17, 90, 25, 290, 47, 90, 25, 290, 77, 90, 25, 225, 17, 90, 25, 222, 17, 90,
			25, 547, 17, 90, 25 };
	/**
	 * Создание массива с координатами кнопок
	 */
	private int[] buttonBounds = { 400, 47, 237, 25, 400, 77, 237, 25 };

	public Interface() {
		/**
		 * Создание основной панели
		 */
		mainPanel = CreateMainPanel();
		/**
		 * Создание фрейма
		 */
		mainFrame = CreateMainFrame("Расчет стоимости тура", mainPanel, 650, 270);
		/**
		 * Заполнение массива лейблов названиями и размерами
		 */
		for (int i = 0; i < 8; i++) {
			label[i] = CreateLabel(labelNames[i], labelBounds[i * 4], labelBounds[i * 4 + 1], labelBounds[i * 4 + 2],
					labelBounds[i * 4 + 3]);
		}
		/**
		 * Заполнение массива текстовых полей размерами
		 */
		for (int i = 0; i < 6; i++) {
			textField[i] = CreateTextField(textFieldsBounds[i * 4], textFieldsBounds[i * 4 + 1],
					textFieldsBounds[i * 4 + 2], textFieldsBounds[i * 4 + 3]);

		}
		/**
		 * Инициализация объекта, ограничивающего ввод в текстовые поля
		 */
		textFieldFilter j = new textFieldFilter();
		/**
		 * Применения ограничения к текстовым полям
		 */
		for (int i = 0; i < 5; i++) {
			j.PTextFilter(textField[i], 7);
		}
		/**
		 * Создание панелей с рамками, прикрепление лейблов и текстовых полей к первой панели
		 */
		for (int i = 0; i < 3; i++) {
			smallPanel[i] = CreateSmallPanel(smallPanelNames[i], smallPanelBounds[i * 4], smallPanelBounds[i * 4 + 1],
					smallPanelBounds[i * 4 + 2], smallPanelBounds[i * 4 + 3]);
			mainPanel.add(smallPanel[i]);
			smallPanel[0].add(label[i]);
			smallPanel[0].add(textField[i]);
		}
		/**
		 * Создание кнопок и переключателей, прикрепление к ним названий и задание размеров, прикрепление их к панелям
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
		 * Создание чекбоксов, прикрепление к ним названий и задание размеров
		 */
		for (int i = 0; i < 3; i++) {
			checkbox[i] = CreateCheckBox(checkboxesNames[i], checkboxesBounds[i * 4], checkboxesBounds[i * 4 + 1],
					checkboxesBounds[i * 4 + 2], checkboxesBounds[i * 4 + 3]);
			smallPanel[2].add(checkbox[i]);
		}
		/**
		 * Запрет на изменение текстового поля для вывода
		 */
		textField[5].setEditable(false);
		/**
		 * Прикрепление оставшихся графических элементов к панелям
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
		 * Применение к переключателям метода, ограничивающего выбор только одного из переключателей
		 */
		selectRadioBtn(radiobutton[0], radiobutton[1]);
		/**
		 * Включение видимости фрейма
		 */
		mainFrame.setVisible(true);
		/**
		 * Добавление обработчика для кнопки расчта
		 */
		button[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * Проверка на заполненность полей
				 */
				if (!textField[0].getText().isEmpty() && !textField[1].getText().isEmpty()
						&& !textField[2].getText().isEmpty() && !textField[3].getText().isEmpty()
						&& !textField[4].getText().isEmpty()) {
					/**
					 * Проверка на выбор хотя бы одного чекбокса
					 */
					if (checkbox[0].isSelected() || checkbox[1].isSelected() || checkbox[2].isSelected()) {
						/**
						 * Проверка на выбор хотя бы одного переключателя
						 */
						if (radiobutton[0].isSelected() || radiobutton[1].isSelected()) {
							/**
							 * Обновление коэффициента еды в случае выбора соответствуюущего чекбокса
							 */
							if (checkbox[0].isSelected()) {
								foodMult = foodMult + 0.2;
							}
							/**
							 * Обновление коэффициента еды в случае выбора соответствуюущего чекбокса
							 */
							if (checkbox[1].isSelected()) {
								foodMult = foodMult + 0.2;
							}
							/**
							 * Обновление коэффициента еды в случае выбора соответствуюущего чекбокса
							 */
							if (checkbox[2].isSelected()) {
								foodMult = foodMult + 0.2;
							}
							/**
							 * Обновление коэффициента транспорта в случае выбора соответствуюущего переключателя
							 */
							if (radiobutton[0].isSelected()) {
								trMult = trMult + 0.34;
							}
							/**
							 * Обновление коэффициента транспорта в случае выбора соответствуюущего переключателя
							 */
							if (radiobutton[1].isSelected()) {
								trMult = trMult + 0.28;
							}
							/**
							 * Объявление элемента, рассчитывающего стоимость тура, задание ему значений, заполненных пользователем
							 */
							Tour a = new Tour(Double.parseDouble(textField[1].getText()),
									Double.parseDouble(textField[0].getText()), trMult, foodMult,
									Double.parseDouble(textField[2].getText()),
									Double.parseDouble(textField[3].getText()),
									Double.parseDouble(textField[4].getText()));
							/**
							 * Вывод текстового значения с результатом в поле
							 */
							textField[5].setText(a.getResult());
							/**
							 * Обнуление коэффициентов после выполнения расчета
							 */
							foodMult = 1;
							trMult = 1;
						}
					}
				}
			}
		});
		/**
		 * Добавление обработчика для кнопки очистки
		 */
		button[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * Очистка полей, путем внесения пустой строки
				 */
				for (int i = 0; i < 6; i++) {
					textField[i].setText("");

				}
			}
		});
	}
	/**
	 * Метод, устанавливающий разрешение на выбор только одного переключателя
	 * @param radio1 Переключатель, передаваемый методу
	 * @param radio2 Переключатель, передаваемый методу
	 */
	public void selectRadioBtn(JRadioButton radio1, JRadioButton radio2) {
		/**
		 * Создание обработчика нажатия для первого переключателя
		 */
		radio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * Установка отметы выбора второго переключателя, при выборе первого переключателя
				 */
				if (radio1.isSelected()) radio2.setSelected(false);
			}
		});
		/**
		 * Создание обработчика нажатия для второго переключателя
		 */
		radio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * Установка отметы выбора первого переключателя, при выборе второго переключателя
				 */
				if (radio2.isSelected()) radio1.setSelected(false);
			}
		});
	}
}
