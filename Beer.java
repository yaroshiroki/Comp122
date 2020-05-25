public class Beer extends ColdBeverage{
	//declaring getPrice function and price
	protected int price = 3;
	public int getPrice() {
			return price;
		}
	//creating a toString function to return "CB"
	public String toString() {
			return ("CB");
		}
	//creating a main function to call the toString and getPrice functions
	public static void main(String[] atgs) {
		//create a b object
		Beer b = new Beer();
		System.out.println(b.toString() + ": $" + b.getPrice());
	}
}