public class Tour {
	/**
	 * Переменные, используемые при расчете стоимости турау
	 */
	double NumDays,NumPeople,transportMultiplier,foodMultiplier,RoomPrice,TransportPrice,FoodPrice;
	/**
	 * Строка, в которую записывается результат для вывода
	 */
	String result;
	/**
	 * Конструктор класса расчета стоимости тура
	 * @param NumDays Количество дней
	 * @param NumPeople Количество людей
	 * @param transportMultiplier Коэффициент цены транспорта
	 * @param foodMultiplier Коэффициент цены еды
	 * @param RoomPrice Цена проживания
	 * @param TransportPrice Цена транспорта
	 * @param FoodPrice Цена еды
	 */
	public Tour(double NumDays, double NumPeople, double transportMultiplier,double foodMultiplier, double RoomPrice, double TransportPrice, double FoodPrice) {
		this.NumDays=NumDays;
		this.NumPeople=NumPeople;
		this.transportMultiplier=transportMultiplier;
		this.foodMultiplier=foodMultiplier;
		this.RoomPrice=RoomPrice;
		this.TransportPrice=TransportPrice;
		this.FoodPrice=FoodPrice;
		result = calcTourCost(NumDays,NumPeople,transportMultiplier,foodMultiplier,RoomPrice,TransportPrice,FoodPrice);
	}
	/**
	 * Метод, возвращающий результат в строковом типе для вывода в текстовом поле
	 * @return Строка, в которую записывается результат для вывода
	 */
	public String getResult() {
		return result;
	}
	/**
	 * Метод расчета стоимости тура
	 * @param NumDays Количество дней
	 * @param NumPeople Количество людей
	 * @param transportMultiplier Коэффициент цены транспорта
	 * @param foodMultiplier Коэффициент цены еды
	 * @param RoomPrice Цена проживания
	 * @param TransportPrice Цена транспорта
	 * @param FoodPrice Цена еды
	 * @return Стоимость тура
	 */
	private static String calcTourCost(double NumDays, double NumPeople, double transportMultiplier,double foodMultiplier, double RoomPrice, double TransportPrice, double FoodPrice) {
		/**
		 * Присваивание переменным изначального значения
		 */
		String TourPriceString = null;
		double TourPriceDouble = 0;
		/**
		 * Расчет стоимости тура по формуле
		 */
		TourPriceDouble = ((RoomPrice*NumDays*NumPeople)+(TransportPrice*NumPeople*transportMultiplier)+(FoodPrice*NumPeople*NumDays*foodMultiplier));
		/**
		 * Конвертация результата расчета в тип Double
		 */
		TourPriceString = Double.toString(TourPriceDouble);
		return TourPriceString;
	}
}
