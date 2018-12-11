public class Tour {
	/**
	 * ����������, ������������ ��� ������� ��������� �����
	 */
	double NumDays,NumPeople,transportMultiplier,foodMultiplier,RoomPrice,TransportPrice,FoodPrice;
	/**
	 * ������, � ������� ������������ ��������� ��� ������
	 */
	String result;
	/**
	 * ����������� ������ ������� ��������� ����
	 * @param NumDays ���������� ����
	 * @param NumPeople ���������� �����
	 * @param transportMultiplier ����������� ���� ����������
	 * @param foodMultiplier ����������� ���� ���
	 * @param RoomPrice ���� ����������
	 * @param TransportPrice ���� ����������
	 * @param FoodPrice ���� ���
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
	 * �����, ������������ ��������� � ��������� ���� ��� ������ � ��������� ����
	 * @return ������, � ������� ������������ ��������� ��� ������
	 */
	public String getResult() {
		return result;
	}
	/**
	 * ����� ������� ��������� ����
	 * @param NumDays ���������� ����
	 * @param NumPeople ���������� �����
	 * @param transportMultiplier ����������� ���� ����������
	 * @param foodMultiplier ����������� ���� ���
	 * @param RoomPrice ���� ����������
	 * @param TransportPrice ���� ����������
	 * @param FoodPrice ���� ���
	 * @return ��������� ����
	 */
	private static String calcTourCost(double NumDays, double NumPeople, double transportMultiplier,double foodMultiplier, double RoomPrice, double TransportPrice, double FoodPrice) {
		/**
		 * ������������ ���������� ������������ ��������
		 */
		String TourPriceString = null;
		double TourPriceDouble = 0;
		/**
		 * ������ ��������� ���� �� �������
		 */
		TourPriceDouble = ((RoomPrice*NumDays*NumPeople)+(TransportPrice*NumPeople*transportMultiplier)+(FoodPrice*NumPeople*NumDays*foodMultiplier));
		/**
		 * ����������� ���������� ������� � ��� Double
		 */
		TourPriceString = Double.toString(TourPriceDouble);
		return TourPriceString;
	}
}
