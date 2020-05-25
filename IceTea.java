public class IceTea extends ColdBeverage{
	//declaring getPrice function and price
	protected int price = 1;
	public int getPrice() {
			return price;
		}
	//creating a toString function to return "CT"
	public String toString() {
			return ("CT");
		}
	//creating a main function to call the toString and getPrice functions
	public static void main(String[] atgs) {
		//create a it object
		IceTea it = new IceTea();
		System.out.println(it.toString() + ": $" + it.getPrice());
	}
}