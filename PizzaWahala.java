import java.util.Scanner;
public class PizzaWahala {
public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int pricePerBox = 0;

	int numberOfSlices = 0;
	
	System.out.println("Number Of People");
	int numberOfPeople = scanner.nextInt();	

	System.out.println("Pizza Type");
	scanner.nextLine();
	String pizzaType = scanner.nextLine();

	if (pizzaType.equalsIgnoreCase("sapa size")){
	numberOfSlices = 4;
	}

	if (pizzaType.equalsIgnoreCase("sapa size")) {		
	pricePerBox = 2000;
	}

	if (pizzaType.equalsIgnoreCase("small money")) {
	numberOfSlices = 6;
	}

	if (pizzaType.equalsIgnoreCase("small money")) {
	pricePerBox = 2400;
	}

	if (pizzaType.equalsIgnoreCase("big boys")) {
	numberOfSlices = 8;
	}

	if (pizzaType.equalsIgnoreCase("big boys")) {
	pricePerBox = 3000;
	}

	 if (pizzaType.equalsIgnoreCase("odogwu")) {
	numberOfSlices = 12;
	}

	if (pizzaType.equalsIgnoreCase("odogwu")) {
	pricePerBox = 4200;
	}

	System.out.println();

	int boxOfPizza = numberOfPeople / numberOfSlices;
	int totals = numberOfPeople % numberOfSlices;
	
	if( totals > 0) {
	boxOfPizza += 1;
	}

	int total = numberOfSlices * boxOfPizza; 
	int leftOver = total - numberOfPeople;
	int price = pricePerBox * boxOfPizza;
	
	System.out.println("Number of boxes of pizza to buy = " + boxOfPizza + "Boxes");
	System.out.println("Number of left over after serving = " + leftOver + "Slices");
	System.out.println("price = " + price);

}
}