public class NoBeverage extends Beverage {
	//declaring getPrice function and price
	protected int price = 0;
	public int getPrice() {
		return price;
	}
	//creating a toString function to return "--"
	public String toString() {
		return("--");
	}
	//creating a main function to call the toString and getPrice functions
	public static void main(String[] args) {
		//creating a nb object
		NoBeverage nb = new NoBeverage();
		System.out.println(nb.toString() + ": $" + nb.getPrice());
	}
}