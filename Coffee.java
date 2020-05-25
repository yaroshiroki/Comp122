public class Coffee extends HotBeverage{
	//declaring getPrice function and price
	protected int price = 2;
	public int getPrice() {
			return price;
		}
	//creating a toString function to return "HC"
	public String toString() {
			return ("HC");
		}
	//creating a main function to call the toString and getPrice functions
	public static void main(String[] atgs) {
		//create a c object
		Coffee c = new Coffee();
		System.out.println(c.toString() + ": $" + c.getPrice());
	}
}