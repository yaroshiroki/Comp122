//import the scanner in order to be able to get an input from a keyboard.
import java.util.Scanner;
class Collatz {
	public static int next(int n) {
		//using the scanner and mapping it to a variable n
		//(which is declared as an integer).
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a natural number");
		int fn;
		n = scan.nextInt();
		
		//using the mod function in order to determine whether to divide 
		//the even number by two
		if ((n % 2) == 0) {
			fn = n/2;
		}
		//or multiply the odd number by 3 and add 1.
		else {
			fn = (3*n + 1);
		}
		return (fn);
	}
	public static int stoppingTime(int n) {
		int fn;
		int stop = 0;
		//creating the stop variable which acts in a similar way to a 
		//count for stoppingTime.
		//for every cycle of the loop, the count goes up by one.
		while (n > 1) {
			stop++;
			if (n % 2 == 0) {
				fn = n / 2;
			}
			else {
				fn = (3 * n) + 1;
			}
			n = fn;
			//string concatonation
			String s = "" + n;
		}
	return(stop);
	}
	public static String sequence(int n) {
		int fn;
		//using string concatonation.
		String s = "" + n;
		//same code as next however using a while loop to repeatedly 
		//print function.
		while (n > 1) {
			if ((n % 2) == 0) {
				fn = n/2;
			}
			else {
				fn = (3*n + 1);
			}
			n = fn;
			//outputting in the required format using string s.
			s = s + "," + n;
		}
			return(s);
	}
	public static void main(String[] args) {
		int n;
		int fn;
		String s = "";
		//c represents the count.
		int c = 0;
		
	//inreasing the count by 1 for every cycle of the for loop.
	for (c = 1; c < 21; c++) {
		//repeated code however ensuring the starting value of n
		//is equalto the value of count, allowing us to output the 
		//first 20 collatz sequences.
		n = c;
		while (n > 1) {
			if ((n % 2) == 0) {
				fn = n/2;
			}
			else {
				fn = (3*n + 1);
			}
			n = fn;
			s = s + "," + n;
			}
			//outputting the funcion in the required format.
			System.out.println(c + s);
			//setting string to "" after every loop so that each sequence
			//isn't repeated on every line
			s = "";
		}
	}
}