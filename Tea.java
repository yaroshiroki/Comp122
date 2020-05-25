public class Tea extends HotBeverage{
	//declaring getPrice function and price
	protected int price = 2;
	public int getPrice() {
			return price;
		}
	//creating a toString function to return "HT"
	public String toString() {
			return ("HT");
		}
	//creating a main function to call the toString and getPrice functions
	public static void main(String[] atgs) {
		//create a t object
		Tea t = new Tea();
		System.out.println(t.toString() + ": $" + t.getPrice());
	}
}